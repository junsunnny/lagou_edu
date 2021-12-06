package com.lagou.dao;

import com.lagou.domain.CourseLesson;

import java.util.List;

public interface LessonMapper {
    /**
     * 根据课程章节信息查询课时信息
     * @param id
     * @return
     */
    public List<CourseLesson> findLessonBYCourseId(Integer id);

    public void saveLesson(CourseLesson courseLesson);
}
