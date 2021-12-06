package cn.junsnunny.dao;

import com.lagou.dao.CourseMapper;
import com.lagou.domain.CourseVO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * dao层测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext-dao.xml")
public class TestCourseMapper {

    private CourseVO courseVO = new CourseVO();
    @Before
    public void before() {

    }

}
