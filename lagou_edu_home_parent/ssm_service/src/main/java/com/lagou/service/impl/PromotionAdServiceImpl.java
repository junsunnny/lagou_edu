package com.lagou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lagou.dao.PromotionAdMapper;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVo;
import com.lagou.service.PromotionAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionAdServiceImpl implements PromotionAdService {

    @Autowired
    private PromotionAdMapper promotionAdMapper;
    /**
     * 分页查询广告
     *
     * @param promotionAdVo
     * @return
     */
    @Override
    public PageInfo<PromotionAd> findAllPromotionAdByPage(PromotionAdVo promotionAdVo) {

        // 1.使用pageHelper进行分页查询 并传入分页需要传入的参数
        PageHelper.startPage(promotionAdVo.getCurrentPage(),promotionAdVo.getPageSize());
        // 2.调用数据访问层进行数据处理
        List<PromotionAd> promotionAdPage = promotionAdMapper.findAllPromotionAdByPage();
        // 3.创建PageInfo对象并将数据访问层返回数据传入到构造方法中 PageInfo中包括分页所需要的数据
        PageInfo<PromotionAd> promotionAdPageInfo = new PageInfo<>(promotionAdPage);
        return promotionAdPageInfo;
    }
}
