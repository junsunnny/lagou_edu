package com.lagou.controller;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;
import com.lagou.domain.ResponseResult;
import com.lagou.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    /**
     * 多条件查询
     * @param courseVO 前台传出的JSON数据封装到VO中
     * @return 前台需要的JSON字符串信息
     */
    @RequestMapping("/findCourseByCondition")
    public ResponseResult findCourseByCondition(@RequestBody CourseVO courseVO) {

        // 调用service层的findCourseByCondition()方法进行业务处理
        List<Course> courseList = courseService.findCourseByCondition(courseVO);

        // 返回数据给前台页面
        return new ResponseResult(true,200,"响应成功",courseList);

    }

    /**
     * 图片上传
     * @return 前台需要的JSON字符串信息
     */
    @RequestMapping("/courseUpload")
    public ResponseResult courseUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        try {
            // 1.判断文件是否为空
            if(file.isEmpty()) {
                throw new RuntimeException();
            }
            // 2.获取项目部署路径
            String realPath = request.getServletContext().getRealPath("/");
            System.out.println(realPath);
            //
            String webappPath = realPath.substring(0, realPath.indexOf("ssm_web_war"));

            // 3.获取源文件名
            String fileName = file.getOriginalFilename();

            // 4.新文件名
            String newFileName = System.currentTimeMillis() + fileName.substring(fileName.lastIndexOf("."));

            // 5.上传文件
            String uploadPath = webappPath + "upload\\";
            File filePath = new File(uploadPath, newFileName);

            //如果目录不存在就创建目录
            if (!filePath.getParentFile().exists()){
                filePath.getParentFile().mkdirs();
                System.out.println("创建目录:" + filePath);
            }
            file.transferTo(filePath);

            // 6.将文件名和文件路径返回
            Map<String,String> map = new HashMap<>();
            map.put("fileName",newFileName);
            map.put("filePath", "http://localhost:8080/upload/" + newFileName);
            return new ResponseResult(true,200,"succse",map);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 新增及修改课程和讲师信息
     */
    @RequestMapping("/saveOrUpdateCourse")
    public ResponseResult saveOrUpdateCourse(@RequestBody CourseVO courseVO) throws InvocationTargetException, IllegalAccessException {
        // 调用service
        // 如果课程id不为0 则是修改课程
        if (courseVO.getId() != 0){
            courseService.updateCourseById(courseVO);
        }else {
            courseService.saveCourseOrTeacher(courseVO);
        }
        return new ResponseResult(true,200,"success",null);
    }

    /**
     * 根据ID查询课程信息
     */
    @RequestMapping("/findCourseById")
    public ResponseResult findCourseById(int id){
        CourseVO course = courseService.findCourseAndTeacherById(id);
        return new ResponseResult(true,200,"success",course);
    }

    @RequestMapping("/updateCourseStatusById")
    public ResponseResult updateCourseStatusById(int id, int status) throws InvocationTargetException, IllegalAccessException {

        courseService.updateCourseStatusById(id,status);

        return new ResponseResult(true,200,"success",null);
    }



}
