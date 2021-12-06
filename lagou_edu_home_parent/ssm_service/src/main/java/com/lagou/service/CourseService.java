package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface CourseService {
    /**
     * 根据多条件查询课程信息
     * @param courseVO 条件封装的实体类
     * @return 查询出的结果数据
     */
    public List<Course> findCourseByCondition(CourseVO courseVO);

    /**
     * 保存课程和讲师信息
     * @param courseVO
     */
    public void saveCourseOrTeacher(CourseVO courseVO) throws InvocationTargetException, IllegalAccessException;

    /**
     * 根据ID查询课程信息
     * @param id
     * @return
     */
    public CourseVO findCourseAndTeacherById(Integer id);

    /**
     *
     * @param courseVO
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public void updateCourseById(CourseVO courseVO) throws InvocationTargetException, IllegalAccessException;

    /**
     * 修改课程状态
     * @param id
     * @param status
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public void updateCourseStatusById(int id, int status) throws InvocationTargetException, IllegalAccessException;

    /**
     * 根据课程id查询课程信息
     */
    public Course findCourseByID(Integer id);
}
