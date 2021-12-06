package com.lagou.service.impl;

import com.lagou.dao.CourseMapper;
import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;
import com.lagou.domain.Teacher;
import com.lagou.service.CourseService;
import com.lagou.utils.DateUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    /**
     * 根据多条件查询课程信息
     *
     * @param courseVO 条件封装的实体类
     * @return 查询出的结果数据
     */
    @Override
    public List<Course> findCourseByCondition(CourseVO courseVO) {
        return courseMapper.findCourseByCondition(courseVO);
    }

    /**
     * 保存课程和讲师信息
     *
     * @param courseVO
     */
    @Override
    public void saveCourseOrTeacher(CourseVO courseVO) throws InvocationTargetException, IllegalAccessException {
        // 封装课程信息
        Course course = new Course();
        BeanUtils.copyProperties(course,courseVO);
        // 对课程参数实体进行补全
        course.setCreateTime(DateUtils.getCurrentTime());
        course.setUpdateTime(DateUtils.getCurrentTime());
        course.setIsDel(0);
        int courseId = course.getId();
        // 对教师参数进行补全
        Teacher teacher = new Teacher();
        BeanUtils.copyProperties(teacher,courseVO);
        teacher.setCourseId(courseId);
        teacher.setCreateTime(DateUtils.getCurrentTime());
        teacher.setUpdateTime(DateUtils.getCurrentTime());
        teacher.setIsDel(0);

        // 3.调用Dao层对应的方法
        courseMapper.saveCousreInfo(course);
        courseMapper.saveTeacherInfo(teacher);
    }

    /**
     * 根据ID查询课程信息
     *
     * @param id
     * @return
     */
    @Override
    public CourseVO findCourseAndTeacherById(Integer id) {
        return courseMapper.findCourseAndTeacherById(id);
    }

    /**
     * 根据id更新课程信息
     *
     * @param courseVO
     */
    @Override
    public void updateCourseById(CourseVO courseVO) throws InvocationTargetException, IllegalAccessException {
        // 1.进行数据的封装使用BeanUtile
        // 1.1对课程信息进行封装
        Course course = new Course();
        BeanUtils.copyProperties(course,courseVO);
        course.setCreateTime(DateUtils.getCurrentTime());
        int courseId = course.getId();
        // 1.2对教师信息进行封装
        Teacher teacher = new Teacher();
        BeanUtils.copyProperties(teacher,courseVO);
        teacher.setCreateTime(DateUtils.getCurrentTime());
        teacher.setCourseId(courseId);
        // 2.调用service方法进行数据更新
        courseMapper.updateCourseById(course);
        courseMapper.updateTeacherByCourseId(teacher);
    }

    /**
     * 跟新课程状态信息
     * @param id
     * @param status
     */
    @Override
    public void updateCourseStatusById(int id, int status){
        // 对数据进行封装
        Course course = new Course();
        course.setId(id);
        course.setStatus(status);
        course.setUpdateTime(DateUtils.getCurrentTime());
        // 2.调用数据访问层的方法
        courseMapper.updateCourseStatus(course);
    }


}
