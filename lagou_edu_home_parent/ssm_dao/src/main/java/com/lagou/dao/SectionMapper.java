package com.lagou.dao;

import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;

import java.util.List;

public interface SectionMapper {
    /**
     * 根据课程id查询课程章节信息
     * @param courseId
     * @return
     */
    public List<CourseSection> findSectionMapper(Integer courseId);

    /**
     * 查询课程信息
     */
    public Course findCourseById(Integer id);

    /**
     * 保存章节信息
     * @param courseSection
     */
    public void saveSection(CourseSection courseSection);

    /**
     * 修改章节信息
     * @param courseSection
     */
    public void updateSection(CourseSection courseSection);

    /**
     * 修改章节状态信息
     * @param courseSection
     */
    public void updateSectionStatus(CourseSection courseSection);
}
