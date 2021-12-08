package com.lagou.controller;

import com.lagou.domain.Menu;
import com.lagou.domain.ResponseResult;
import com.lagou.domain.RoleMenuVO;
import com.lagou.domain.Roles;
import com.lagou.service.MenuService;
import com.lagou.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private MenuService menuService;
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

    /**
     * 查询所有父子菜单信息
     * @return
     */
    @RequestMapping("/findAllMenu")
    public ResponseResult findNodeMenuList() {
        // -1 表示父级菜单的pid
        List<Menu> menuList = menuService.findMenuListByPid(-1);

        // 响应数据和接口文档不一样 进行封装改造
        HashMap<String, Object> map = new HashMap<>();
        map.put("parentMenuList",menuList);

        return new ResponseResult(true, 200, "菜单响应成功", map);
    }

    /**
     * 根据角色信息查询关联菜单
     * @param roleId
     * @return
     */
    @RequestMapping("/findMenuByRoleId")
    public ResponseResult findMenuById(Integer roleId) {
        List<Integer> menuById = roleService.findMenuById(roleId);
        return new ResponseResult(true,200,"菜单序号查询成功",menuById);
    }

    /**
     * 分配角色信息
     * @param roleMenuVO
     * @return
     */
    @RequestMapping("/roleContextMenu")
    public ResponseResult roleContextMenu(@RequestBody RoleMenuVO roleMenuVO) {
        roleService.roleContextMenu(roleMenuVO);
        return new ResponseResult(true,200,"角色分配菜单成功",null);
    }

}

