package com.lagou.dao;

import com.lagou.domain.CourseLesson;

import java.util.List;

public interface LessonMapper {

    /**
     * 根据章节ID返回章节数据
     * @param courseId
     * @return
     */
    public List<CourseLesson> findLessonByCourseID(Integer courseId);

}
