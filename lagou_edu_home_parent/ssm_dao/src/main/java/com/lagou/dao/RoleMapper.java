package com.lagou.dao;

import com.lagou.domain.Roles;

import java.util.List;

/**
 * 角色表
 */
public interface RoleMapper {
    /**
     * 角色查询&条件查询&回显信息
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
}
