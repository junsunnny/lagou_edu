package com.lagou.service;

import com.lagou.domain.CourseLesson;

public interface LessonService {
    /**
     * 保存课时信息
     * @param courseLesson
     */
    public void saveLesson(CourseLesson courseLesson);

    /**
     * 更新课程信息
     * @param courseLesson
     */
    public void updateLesson(CourseLesson courseLesson);

    /**
     * 回显课时信息
     * @param id
     */
    public CourseLesson findLessonById(Integer id);

    /**
     * 修改课时状态
     * @param id
     * @param status
     */
    public void updateLessonStatus(Integer id, Integer status);
}
