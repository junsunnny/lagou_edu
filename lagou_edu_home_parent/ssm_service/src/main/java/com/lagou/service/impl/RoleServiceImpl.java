package com.lagou.service.impl;

import com.lagou.dao.RoleMapper;
import com.lagou.domain.RoleMenuRelation;
import com.lagou.domain.RoleMenuVO;
import com.lagou.domain.Roles;
import com.lagou.service.RoleService;
import com.lagou.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
   private RoleMapper roleMapper;
    /**
     * 角色查询&条件查询
     *
     * @param roles
     * @return
     */
    @Override
    public List<Roles> findAllRole(Roles roles) {
        return roleMapper.findAllRole(roles);
    }

    /**
     * 添加角色信息
     *
     * @param roles
     */
    @Override
    public void saveRole(Roles roles) {
        // 1.补全参数信息
        roles.setCreatedTime(DateUtils.getCurrentTime());
        roles.setUpdatedTime(DateUtils.getCurrentTime());
        // 假数据
        roles.setUpdatedBy("system");
        roles.setCreatedBy("syttem");

        // 2.调用数据访问层
        roleMapper.saveRole(roles);
    }

    /**
     * 修改角色信息
     *
     * @param roles
     */
    @Override
    public void updateRole(Roles roles) {
        // 1.补全参数信息
        roles.setUpdatedTime(DateUtils.getCurrentTime());
        // 假数据
        roles.setUpdatedBy("system");
        // 2.调用service方法
        roleMapper.updateRole(roles);
    }

    /**
     * 回显课程信息
     */
    @Override
    public Roles finRoleById(Integer id) {
        Roles roles = new Roles();
        roles.setId(id);
        List<Roles> allRole = roleMapper.findAllRole(roles);
        System.out.println(allRole);

        if (!allRole.isEmpty()) {
            roles = allRole.get(0);
            return roles;
        } else {
            return null;
        }
    }

    /**
     * 根据角色信息查询关联菜单id
     *
     * @param roleId
     */
    @Override
    public List<Integer> findMenuById(Integer roleId) {
        return roleMapper.findMenuById(roleId);
    }

    /**
     * 为角色分配菜单
     *
     * @param roleMenuVO
     */
    @Override
    public void roleContextMenu(RoleMenuVO roleMenuVO) {
        // 1.清空中间表的关联关系
        roleMapper.deleteRoleMenuRelationByRoleId(roleMenuVO.getRoleId());

        // 2.为角色分配菜单
        RoleMenuRelation roleMenu = new RoleMenuRelation();
        roleMenu.setRoleId(roleMenuVO.getRoleId());
        roleMenu.setCreatedBy("system");
        roleMenu.setUpdatedBy("syetem");
        for (Integer menuId : roleMenuVO.getMenuIdList()) {
            roleMenu.setCreatedTime(DateUtils.getCurrentTime());
            roleMenu.setUpdatedTime(DateUtils.getCurrentTime());
            roleMenu.setMenuId(menuId);
            roleMapper.saveRoleMenuRelationByRoleId(roleMenu);
        }
    }
}
