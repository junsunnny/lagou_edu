package com.lagou.controller;

import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;
import com.lagou.domain.ResponseResult;
import com.lagou.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("/findCourseById")
    public ResponseResult findCourseById(Integer courseId){
        Course course = sectionService.findCourseByID(courseId);
        return new ResponseResult(true,200,"查询成功", course);
    }
}
