package com.lagou.service;

import com.lagou.domain.Roles;

import java.util.List;

public interface RoleService {
    /**
     * 角色查询&条件查询
     * @param roles
     * @return
     */
    public List<Roles> findAllRole(Roles roles);

    /**
     * 添加角色信息
     * @param roles
     */
    public void saveRole(Roles roles);

    /**
     * 修改角色信息
     * @param roles
     */
    public void updateRole(Roles roles);

    /**
     * 回显课程信息
     */
    public Roles finRoleById(Integer id);

    /**
     * 根据角色信息查询关联菜单id
     */
    public List<Integer> findMenuById(Integer roleId);
}
