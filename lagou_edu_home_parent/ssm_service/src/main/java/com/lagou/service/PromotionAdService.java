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
}
