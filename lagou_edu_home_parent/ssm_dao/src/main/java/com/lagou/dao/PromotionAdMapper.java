package com.lagou.dao;

import com.lagou.domain.PromotionAd;

import java.util.List;

public interface PromotionAdMapper {
    /**
     * 分页查询广告
     * @return
     */
    public List<PromotionAd> findAllPromotionAdByPage();
}
