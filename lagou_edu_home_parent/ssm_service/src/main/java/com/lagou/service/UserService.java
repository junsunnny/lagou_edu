package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.UserVO;

public interface UserService {
    /**
     * 多条件查询用户表
     * @param userVO
     * @return
     */
    public PageInfo findUserCondition(UserVO userVO);

    /**
     * 修改用户状态信息
     * @param id
     * @param status
     */
    public String updateUserStatus(Integer id, String status);
}
