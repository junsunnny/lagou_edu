package com.lagou.dao;

import com.lagou.domain.RoleMenuRelation;
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

    /**
     * 根据角色信息查询关联菜单
     */
    public List<Integer> findMenuById(Integer roleId);

    /**
     * 清空角色表和菜单表对应的关联关系
     * @param roleId
     */
    public void deleteRoleMenuRelationByRoleId(Integer roleId);

    /**
     * 新增角色表和菜单表对应的关联关系
     * @param roleMenuRelation
     */
    public void saveRoleMenuRelationByRoleId(RoleMenuRelation roleMenuRelation);
}
