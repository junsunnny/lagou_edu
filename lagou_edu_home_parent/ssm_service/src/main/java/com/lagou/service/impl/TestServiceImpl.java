package com.lagou.service.impl;

import com.lagou.dao.TestDao;
import com.lagou.domain.Test;
import com.lagou.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    // 查询test表下所有用户信息
    @Override
    public List<Test> findAll() {
        return testDao.findAll();
    }
}
