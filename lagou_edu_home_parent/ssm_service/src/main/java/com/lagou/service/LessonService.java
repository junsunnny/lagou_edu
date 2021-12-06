package com.lagou.service;

import com.lagou.domain.CourseLesson;

public interface LessonService {
    /**
     * 保存课时信息
     * @param courseLesson
     */
    public void saveLesson(CourseLesson courseLesson);
}
