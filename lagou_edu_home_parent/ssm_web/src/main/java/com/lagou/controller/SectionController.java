package com.lagou.controller;

import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;
import com.lagou.domain.ResponseResult;
import com.lagou.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/section")
public class SectionController {

    @Autowired
    private SectionService sectionService;

    /**
     * 根据课程id查询章节信息和课时信息
     * @param courseId
     * @return
     */
    @RequestMapping("/findSectionAndLessonByCourseId")
    public ResponseResult findSectionAndLessonByCourseId(Integer courseId){
        List<CourseSection> courseList = sectionService.findCourseAndLessonByCourseId(courseId);
        return new ResponseResult(true, 200, "课程查询成功", courseList);
    }

    /**
     * 根据课程id回显课程信息
     * @param courseId
     * @return
     */
    @RequestMapping("/findCourseById")
    public ResponseResult findCourseById(Integer courseId){
        Course course = sectionService.findCourseByID(courseId);
        return new ResponseResult(true,200,"查询成功", course);
    }

    /**
     * 保存或修改章节信息
     * @param courseSection
     * @return
     */
    @RequestMapping("/saveOrUpdateSection")
    public ResponseResult saveOrUpdateSection(@RequestBody CourseSection courseSection) {
        if (courseSection.getId() == 0){
            sectionService.saveSection(courseSection);
            return new ResponseResult(true,200,"新建成功",null);
        }else {
            sectionService.updateSection(courseSection);
            return new ResponseResult(true,200,"修改成功",null);
        }
    }

    /**
     * 修改课程状态
     * @param id
     * @param status
     * @return
     */
    @RequestMapping("/updateSectionStatus")
    public ResponseResult updateSectionStatus(Integer id, Integer status){
        sectionService.updateSectionStatus(id,status);
        return new ResponseResult(true,200,"修改成功",null);
    }
}
