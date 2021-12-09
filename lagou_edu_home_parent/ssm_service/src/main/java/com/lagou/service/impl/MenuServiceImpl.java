package com.lagou.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lagou.dao.MenuMapper;
import com.lagou.domain.Menu;
import com.lagou.domain.PageVO;
import com.lagou.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;
    /**
     * 根据Pid查询父子级菜单
     *
     * @param pid
     * @return
     */
    @Override
    public List<Menu> findMenuListByPid(Integer pid) {
        return  menuMapper.findMenuListByPid(pid);
    }

    /**
     * 查询菜单所有信息
     *
     * @return
     */
    @Override
    public PageInfo findAllMenu(PageVO pageVO) {
        PageHelper.startPage(pageVO.getCurrentPage(), pageVO.getPageSize());
        List<Menu> allMenu = menuMapper.findAllMenu(null);
        return new PageInfo<>(allMenu);
    }

    /**
     * 回显父级菜单
     * @param id
     * @return
     *
     */
    @Override
    public List<Menu> findParentAndSonMenu(Integer id) {
        // 1.进行数据封装
        Menu menu = new Menu();
        if (id != -1){
            menu.setId(id);
        }else {
            menu.setParentId(id);
        }
        return menuMapper.findAllMenu(menu);
    }

    /**
     * 保存菜单信息
     *
     * @param menu
     */
    @Override
    public void saveMenu(Menu menu) {
        menuMapper.saveMenu(menu);
    }

    /**
     * 修改菜单信息
     *
     * @param menu
     */
    @Override
    public void updateMenu(Menu menu) {
        menuMapper.updateMenu(menu);
    }
}
