package com.lagou.service.impl;

import com.lagou.dao.MenuMapper;
import com.lagou.domain.Menu;
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
}
