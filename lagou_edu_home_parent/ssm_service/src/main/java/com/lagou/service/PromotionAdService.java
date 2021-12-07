package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVo;

import java.util.List;

public interface PromotionAdService {
    /**
     * 分页查询广告
     * @return
     */
    public PageInfo<PromotionAd> findAllPromotionAdByPage(PromotionAdVo promotionAdVo);

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
     * @param id
     * @param status
     */
    public void updatePromotionAdStatus(Integer id, Integer status);
}
