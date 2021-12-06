package com.lagou.service.impl;

import com.lagou.dao.LessonMapper;
import com.lagou.domain.CourseLesson;
import com.lagou.service.LessonService;
import com.lagou.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    private LessonMapper lessonMapper;
    /**
     * 保存课时信息
     *
     * @param courseLesson
     */
    @Override
    public void saveLesson(CourseLesson courseLesson) {
        // 1.不全课时信息
        courseLesson.setCreateTime(DateUtils.getCurrentTime());
        courseLesson.setUpdateTime(DateUtils.getCurrentTime());
        courseLesson.setIsDel(0);

        // 2.调用dao层方法
        lessonMapper.saveLesson(courseLesson);
    }

    /**
     * 更新课程信息
     *
     * @param courseLesson
     */
    @Override
    public void updateLesson(CourseLesson courseLesson) {
        // 1.补全课时信息
        courseLesson.setUpdateTime(DateUtils.getCurrentTime());

        // 2.调用dao层
        lessonMapper.updateLesson(courseLesson);
    }

    /**
     * 回显课时信息
     *
     * @param id
     */
    @Override
    public CourseLesson findLessonById(Integer id) {
        return lessonMapper.findLessonById(id);
    }

    /**
     * 修改课时状态
     *
     * @param id
     * @param status
     */
    @Override
    public void updateLessonStatus(Integer id, Integer status) {
        // 填写信息
        CourseLesson lesson = new CourseLesson();
        lesson.setId(id);
        lesson.setStatus(status);
        lesson.setUpdateTime(DateUtils.getCurrentTime());

        // 2.调用dao层
        lessonMapper.updateLessonStatus(lesson);
    }
}
