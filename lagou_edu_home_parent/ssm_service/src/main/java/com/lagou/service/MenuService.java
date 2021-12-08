package com.lagou.service;

import com.lagou.domain.Menu;

import java.util.List;

public interface MenuService {
    /**
     * 根据Pid查询父子级菜单
     * @param pid
     * @return
     */
    public List<Menu> findMenuListByPid(Integer pid);
}
