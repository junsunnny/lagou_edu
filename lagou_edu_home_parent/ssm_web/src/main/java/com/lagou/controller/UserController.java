package com.lagou.controller;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.ResponseResult;
import com.lagou.domain.User;
import com.lagou.domain.UserVO;
import com.lagou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 多条件查询
     * @param userVO
     * @return
     */
    @RequestMapping("/findUserCondition")
    private ResponseResult findUserCondition(@RequestBody UserVO userVO) {

        System.out.println(userVO);
        PageInfo userCondition = userService.findUserCondition(userVO);
        System.out.println(userVO);

        return new ResponseResult(true,200,"多条件查询成功",userCondition);
    }

    /**
     * 修改学生状态信息
     * @param id
     * @param status
     * @return
     */
    @RequestMapping("/updateUserStatus")
    public ResponseResult updateUserStatus(Integer id, String status) {
        String userStatus = userService.updateUserStatus(id, status);
        return new ResponseResult(true,200,"修改学生状态成功",userStatus);
    }
}
