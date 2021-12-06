package com.lagou.controller;

import com.lagou.domain.CourseLesson;
import com.lagou.domain.ResponseResult;
import com.lagou.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson")
public class LessonController {

    @Autowired
    private LessonService lessonService;

    /**
     * 保存和修改课时信息
     * @param courseLesson
     * @return
     */
    @RequestMapping("/saveOrUpdateLesson")
    public ResponseResult saveOrUpdateLesson(@RequestBody CourseLesson courseLesson) {
        lessonService.saveLesson(courseLesson);
        return new ResponseResult(true,200,"保存课时成功",null);
    }
}
