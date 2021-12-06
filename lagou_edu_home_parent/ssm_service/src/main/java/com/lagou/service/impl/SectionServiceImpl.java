package com.lagou.service.impl;

import com.lagou.dao.SectionMapper;
import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;
import com.lagou.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {

    @Autowired
    private SectionMapper sectionMapper;
    /**
     * 根据课程id查询课程章节信息和课时信息
     *
     * @param courseId
     */
    @Override
    public List<CourseSection> findCourseAndLessonByCourseId(Integer courseId) {
        return sectionMapper.findSectionMapper(courseId);
    }

    /**
     * 根据课程id查询课程信息
     * @param courseId
     * @return
     */
    @Override
    public Course findCourseByID(Integer courseId) {
        return sectionMapper.findCourseById(courseId);
    }

}
