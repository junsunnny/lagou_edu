package com.lagou.service.impl;

import com.lagou.dao.SectionMapper;
import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;
import com.lagou.service.SectionService;
import com.lagou.utils.DateUtils;
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

    /**
     * 根据课程id添加章节信息
     *
     * @param courseSection
     */
    @Override
    public void saveSection(CourseSection courseSection) {
        // 补全信息
        courseSection.setCreateTime(DateUtils.getCurrentTime());
        courseSection.setUpdateTime(DateUtils.getCurrentTime());
        courseSection.setIsDe(0);
        // 2.调用业务层方法
        sectionMapper.saveSection(courseSection);
    }

    /**
     * 修改课程信息
     *
     * @param courseSection
     */
    @Override
    public void updateSection(CourseSection courseSection) {
        // 补全信息
        courseSection.setUpdateTime(DateUtils.getCurrentTime());
        // 调用业务层方法
        sectionMapper.updateSection(courseSection);
    }

    /**
     * 更改章节状态信息
     *
     * @param id
     * @param status
     */
    @Override
    public void updateSectionStatus(Integer id, Integer status) {
        // 1.进行数据封装
        CourseSection courseSection = new CourseSection();
        courseSection.setId(id);
        courseSection.setStatus(status);
        courseSection.setUpdateTime(DateUtils.getCurrentTime());

        // 2.调用dao层的方法
        sectionMapper.updateSectionStatus(courseSection);
    }


}
