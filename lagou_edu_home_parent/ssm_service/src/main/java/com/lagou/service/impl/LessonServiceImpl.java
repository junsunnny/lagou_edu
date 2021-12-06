package com.lagou.service.impl;

import com.lagou.dao.LessonMapper;
import com.lagou.domain.CourseLesson;
import com.lagou.service.LessonService;
import com.lagou.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    private LessonMapper lessonMapper;
    /**
     * 保存课时信息
     *
     * @param courseLesson
     */
    @Override
    public void saveLesson(CourseLesson courseLesson) {
        // 1.不全课时信息
        courseLesson.setCreateTime(DateUtils.getCurrentTime());
        courseLesson.setUpdateTime(DateUtils.getCurrentTime());
        courseLesson.setIsDel(0);

        // 2.调用dao层方法
        lessonMapper.saveLesson(courseLesson);
    }
}
