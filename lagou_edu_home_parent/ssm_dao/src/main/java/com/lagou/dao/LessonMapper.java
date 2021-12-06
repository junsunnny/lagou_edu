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

    /**
     * 保存课时信息
     * @param courseLesson
     */
    public void saveLesson(CourseLesson courseLesson);

    /**
     * 修改课时信息
     * @param courseLesson
     */
    public void updateLesson(CourseLesson courseLesson);

    /**
     * 回显课程信息
     * @param id
     */
    public CourseLesson findLessonById(Integer id);

    /**
     * 修改课程状态
     * @param courseLesson
     */
    public void updateLessonStatus(CourseLesson courseLesson);
}
