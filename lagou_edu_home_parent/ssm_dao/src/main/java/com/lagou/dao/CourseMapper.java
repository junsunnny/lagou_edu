package com.lagou.dao;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;
import com.lagou.domain.Teacher;

import java.util.List;

public interface CourseMapper {

    /**
     * 根据多条件查询课程信息
     *
     */

    public List<Course> findCourseByCondition(CourseVO courseVO);

    /**
     * 新增课程信息
     */
    public void saveCousreInfo(Course course);

    /**
     * 新增讲师信息
     */
    public void saveTeacherInfo(Teacher teacher);

    /**
     * 根据课程id查询课程信息
     */
    public CourseVO findCourseAndTeacherById(Integer id);

    /**
     * 修改课程信息
     */
    public void updateCourseById(Course course);

    /**
     * 修改老师信息
     */
    public void updateTeacherByCourseId(Teacher teacher);

    /**
     * 修改课程状态信息
     */
    public void updateCourseStatus(Course course);


}
