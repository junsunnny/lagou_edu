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

}
