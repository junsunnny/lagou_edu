package com.lagou.service;

import com.lagou.domain.Test;

import java.util.List;

public interface TestService {
    // 查询test表中所有信息
    public List<Test> findAll();
}
