package com.lagou.dao;

import com.lagou.domain.Menu;

import java.util.List;

public interface MenuMapper {
    /**
     * 查询所有父级级关联的子集菜单
     * @param id
     * @return
     */
    public List<Menu> findMenuListByPid(Integer id);

    /**
     * 查询所有菜单列表
     */
    public List<Menu> findAllMenu(Menu menu);

    /**
     * 保存菜单信息
     * @param menu
     */
    void saveMenu(Menu menu);

    /**
     * 修改菜单信息
     * @param menu
     */
    void updateMenu(Menu menu);
}
