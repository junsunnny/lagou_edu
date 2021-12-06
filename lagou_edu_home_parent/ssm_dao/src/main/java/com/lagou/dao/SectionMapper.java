package com.lagou.dao;

import com.lagou.domain.CourseSection;

import java.util.List;

public interface SectionMapper {
    /**
     * 根据课程id查询课程章节信息
     * @param courseId
     * @return
     */
    public List<CourseSection> findSectionMapper(Integer courseId);
}
