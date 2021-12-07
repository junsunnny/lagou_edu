package com.lagou.dao;

import com.lagou.domain.User;
import com.lagou.domain.UserVO;

import java.util.List;

/**
 * 用户模块数据访问层
 */
public interface UserMapper {
    /**
     * 多条件查询User表
     * @return
     */
    public List<User> findUserCondition(UserVO userVO);

    /**
     * 修改用户状态信息
     * @param user
     */
    public void updateUserStatus(User user);

    /**
     * 根据用户id查询用户状态
     * @param id
     * @return
     */
    public String findUserStatus(Integer id);

}
