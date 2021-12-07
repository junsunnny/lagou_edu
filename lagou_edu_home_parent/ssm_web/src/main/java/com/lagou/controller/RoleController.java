package com.lagou.controller;

import com.lagou.domain.ResponseResult;
import com.lagou.domain.Roles;
import com.lagou.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    /**
     * 查询所有角色信息
     *
     * @return
     */
    @RequestMapping("/findAllRose")
    public ResponseResult findAllRose(@RequestBody Roles roles) {
        List<Roles> rolesList = roleService.findAllRole(roles);
        return new ResponseResult(true, 200, "查询所有角色成功", rolesList);
    }

    /**
     * 保存角色信息
     *
     * @param roles
     * @return
     */
    @RequestMapping("/saveOrUpdateRole")
    public ResponseResult saveOrUpdateRole(@RequestBody Roles roles) {
        if (roles.getId() != null) {
            roleService.updateRole(roles);
            return new ResponseResult(true, 200, "修改角色信息成功", null);
        } else {
            roleService.saveRole(roles);
            return new ResponseResult(true, 200, "新建角色成功", null);
        }
    }

    /**
     * 回显角色信息
     */
    @RequestMapping("/findRoleById")
    public ResponseResult findRoleById(Integer id) {
        Roles role = roleService.finRoleById(id);
        return new ResponseResult(true, 200, "回显角色信息成功", role);
    }

}

