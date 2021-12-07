package com.lagou.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lagou.dao.UserMapper;
import com.lagou.domain.User;
import com.lagou.domain.UserVO;
import com.lagou.service.UserService;
import com.lagou.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    /**
     * 多条件查询
     * @param userVO
     * @return
     */
    @Override
    public PageInfo findUserCondition(UserVO userVO) {
        // System.out.println(userVO);
        PageHelper.startPage(userVO.getCurrentPage(),userVO.getPageSize());
        // System.out.println(userVO);
        List<User> userList = userMapper.findUserCondition(userVO);
        PageInfo<User> userPageInfo = new PageInfo<>(userList);
        return userPageInfo;
    }

    /**
     * 修改用户状态信息
     *
     * @param id
     * @param status
     */
    @Override
    public String updateUserStatus(Integer id, String status) {
        // 1.补全参数
        User user = new User();
        user.setId(id);
        user.setStatus(status);
        user.setUpdateTime(DateUtils.getCurrentTime());

        // 2.调用数据访问层
        userMapper.updateUserStatus(user);
        return userMapper.findUserStatus(id);
    }
}
