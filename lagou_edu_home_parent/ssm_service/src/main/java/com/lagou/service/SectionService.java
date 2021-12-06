package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;

import java.util.List;

public interface SectionService {
    /**
     * 根据课程id查询课程章节信息和课时信息
     * @param CourseId
     */
    public List<CourseSection> findCourseAndLessonByCourseId(Integer CourseId);

    /**
     * 根据课程id查询课程信息
     */
    public Course findCourseByID(Integer courseId);

    /**
     * 根据课程id添加章节信息
     * @param courseSection
     */
    public void saveSection(CourseSection courseSection);
}
