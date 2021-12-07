package com.lagou.service.impl;

import com.lagou.dao.RoleMapper;
import com.lagou.domain.Roles;
import com.lagou.service.RoleService;
import com.lagou.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
