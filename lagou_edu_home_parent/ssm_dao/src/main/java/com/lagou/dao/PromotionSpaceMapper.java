package com.lagou.dao;

import com.lagou.domain.PromotionSpace;

import java.util.List;

public interface PromotionSpaceMapper {

    /**
     * 查看所有广告位信息
     * @return
     */
    public List<PromotionSpace> findAllPromotionSpace();

    /**
     * 保存广告位信息
     * @param promotionSpace
     */
    public void savePromotionSpace(PromotionSpace promotionSpace);

    /**
     * 根据id回显广告位信息
     * @param id
     * @return
     */
    public PromotionSpace findPromotionSpaceById(Integer id);

    /**
     * 修改广告位信息
     * @param promotionSpace
     */
    public void updatePromotionSpace(PromotionSpace promotionSpace);
}
