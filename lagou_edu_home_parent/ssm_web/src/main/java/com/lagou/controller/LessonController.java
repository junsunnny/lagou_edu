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
        if (courseLesson.getId() != 0){
            lessonService.updateLesson(courseLesson);
            return new ResponseResult(true,200,"修改课时成功",null);
        }else {
            lessonService.saveLesson(courseLesson);
            return new ResponseResult(true,200,"保存课时成功",null);
        }
    }

    /**
     * 回显课时信息
     * @param id
     * @return
     */
    @RequestMapping("/findLessonById")
    public ResponseResult findLessonById(Integer id){
        CourseLesson lesson = lessonService.findLessonById(id);
        return new ResponseResult(true,200,"查询成功",lesson);
    }

    /**
     * 修改课时状态
     * @param id
     * @param status
     * @return
     */
    @RequestMapping("/updateLessonStatus")
    public ResponseResult updateLessonStatus(Integer id, Integer status) {
        lessonService.updateLessonStatus(id,status);
        return new ResponseResult(true,200,"修改成功",null);
    }
}
