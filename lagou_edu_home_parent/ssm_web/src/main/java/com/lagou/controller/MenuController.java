package com.lagou.controller;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.Menu;
import com.lagou.domain.PageVO;
import com.lagou.domain.ResponseResult;
import com.lagou.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    /**
     * 查询所有菜单信息
     * @param pageVO
     * @return
     */
    @RequestMapping("/findAllMenu")
    public ResponseResult findAllMenu(PageVO pageVO) {
        PageInfo allMenu = menuService.findAllMenu(pageVO);
        return new ResponseResult(true,200,"查询成功",allMenu);
    }

    /**
     * 查询菜单信息(回显)(可以优化)
     * @param id
     * @return
     */
    @RequestMapping("/findMenuInfoById")
    public ResponseResult findMenuInfoById(Integer id) {
        // 对前台传入的参数进行判断 如果为-1则是父级菜单的回显 1则是子级菜单的回显
        Map<String,Object> map = new HashMap();
        if (id == -1) {
            List<Menu> parentMenu = menuService.findParentAndSonMenu(id);
            map.put("menuInfo",null);
            map.put("parentMenuList",parentMenu);
            return new ResponseResult(true, 200, "新增菜单查询成功", map);
        }else {
            List<Menu> sonMenu = menuService.findParentAndSonMenu(id);
            List<Menu> parentMenu = menuService.findParentAndSonMenu(-1);
            map.put("menuInfo",sonMenu.get(0));
            map.put("parentMenuList",parentMenu);
            return new ResponseResult(true, 200, "修改菜单查询成功", map);
        }
    }

    /**
     * 新建和修改信息
     * @param menu
     * @return
     */
    @RequestMapping("/saveOrUpdateMenu")
    public ResponseResult saveOrUpdateMenu(@RequestBody Menu menu) {
        if (menu.getId() != 0) {
            menuService.updateMenu(menu);
            return new ResponseResult(true, 200, "修改菜单成功", null);
        }else {
            menuService.saveMenu(menu);
            return new ResponseResult(true, 200, "保存菜单成功", null);
        }
    }
}
