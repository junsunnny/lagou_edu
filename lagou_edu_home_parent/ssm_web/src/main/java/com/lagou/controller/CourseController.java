package com.lagou.controller;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;
import com.lagou.domain.ResponseResult;
import com.lagou.service.CourseService;
import com.lagou.utils.UploadImgUtils;
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
        // 1.调用图片上传的方法并返回数据
        Map<String, String> resultMap = UploadImgUtils.uplaodImgMethod(file, request);
        // 2.判断返回结果是否为空 如果不为空上传成功 否则上传失败 返回null
        if (resultMap != null){
            return new ResponseResult(true,200,"图片上传成功",resultMap);
        }else{
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
