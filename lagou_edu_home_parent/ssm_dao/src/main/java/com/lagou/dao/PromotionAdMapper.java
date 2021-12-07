package com.lagou.dao;

import com.lagou.domain.PromotionAd;

import java.util.List;

public interface PromotionAdMapper {
    /**
     * 分页查询广告
     * @return
     */
    public List<PromotionAd> findAllPromotionAdByPage();

    /**
     * 新建广告信息
     * @param promotionAd
     */
    public void savePromotionAd(PromotionAd promotionAd);

    /**
     * 回显广告信息
     */
    public PromotionAd findPromotionAdById(Integer id);

    /**
     * 修改广告信息
     */
    public void updatePromotionAd(PromotionAd promotionAd);

    /**
     * 广告动态上下线
     * @param promotionAd
     */
    public void updatePromotionAdStatus(PromotionAd promotionAd);
}
