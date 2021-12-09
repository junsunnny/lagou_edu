package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.Menu;
import com.lagou.domain.PageVO;

import java.util.List;

public interface MenuService {
    /**
     * 根据Pid查询父子级菜单
     * @param pid
     * @return
     */
    public List<Menu> findMenuListByPid(Integer pid);

    /**
     * 查询菜单所有信息
     * @param pageVO
     * @return
     */
    public PageInfo findAllMenu(PageVO pageVO);

    /**
     * 回显父级菜单
     * @param id
     * @return
     */
    public List<Menu> findParentAndSonMenu(Integer id);

    /**
     * 更新菜单信息
     * @param menu
     */
    void updateMenu(Menu menu);

    /**
     * 修改菜单信息
     * @param menu
     */
    void saveMenu(Menu menu);
}
