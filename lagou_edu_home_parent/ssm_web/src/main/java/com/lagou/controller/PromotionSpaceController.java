package com.lagou.controller;

import com.lagou.domain.PromotionSpace;
import com.lagou.domain.ResponseResult;
import com.lagou.service.PromotionSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/promotionSpace")
public class PromotionSpaceController {

    @Autowired
    private PromotionSpaceService promotionSpaceService;

    /**
     * 显示所有广告位信息
     * @return
     */
    @RequestMapping("/promotionSpace")
    public ResponseResult findAllPromotionSpace() {
        List<PromotionSpace> promotionSpaceList = promotionSpaceService.findAllPromotionSpace();
        return new ResponseResult(true, 200, "查询成功",promotionSpaceList);
    }

    /**
     * 保存和修改广告栏信息
     * @param promotionSpace
     * @return
     */
    @RequestMapping("/saveOrUpdatePromotionSpace")
    public ResponseResult saveOrUpdatePromotionSpace(@RequestBody PromotionSpace promotionSpace) {
        // 1.使用前端传入的参数判断是添加还是修改
        if (promotionSpace.getId() != 0){
            promotionSpaceService.updatePromotionSpace(promotionSpace);
            return new ResponseResult(true, 200, "修改成功", null);
        }else {
            promotionSpaceService.savePromotionSpace(promotionSpace);
            return new ResponseResult(true,200,"创建成功",null);
        }
    }

    /**
     * 根据id回显广告位信息
     * @param id
     * @return
     */
    @RequestMapping("/findPromotionSpaceById")
    public ResponseResult findPromotionSpaceById(Integer id){
        PromotionSpace promotionSpace = promotionSpaceService.findPromotionSpaceById(id);
        return new ResponseResult(true, 200, "查询成功",promotionSpace);
    }
}
