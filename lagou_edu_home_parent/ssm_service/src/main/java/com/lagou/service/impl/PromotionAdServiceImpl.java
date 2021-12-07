package com.lagou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lagou.dao.PromotionAdMapper;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVo;
import com.lagou.service.PromotionAdService;
import com.lagou.utils.DateUtils;
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

    /**
     * 新建广告信息
     *
     * @param promotionAd
     */
    @Override
    public void savePromotionAd(PromotionAd promotionAd) {
        // 1.补全数据信息
        promotionAd.setCreateTime(DateUtils.getCurrentTime());
        promotionAd.setUpdateTime(DateUtils.getCurrentTime());
        promotionAd.setPriority(0);

        // 2.调用数据访问层
        promotionAdMapper.savePromotionAd(promotionAd);

    }

    /**
     * 回显广告信息
     *
     * @param id
     */
    @Override
    public PromotionAd findPromotionAdById(Integer id) {
        return promotionAdMapper.findPromotionAdById(id);
    }

    /**
     * 修改广告信息
     *
     * @param promotionAd
     */
    @Override
    public void updatePromotionAd(PromotionAd promotionAd) {
        // 1.补全参数
        promotionAd.setUpdateTime(DateUtils.getCurrentTime());

        // 2.调用数据访问层对应的功能
        promotionAdMapper.updatePromotionAd(promotionAd);
    }

    /**
     * 广告动态上下线
     *
     * @param id
     * @param status
     */
    @Override
    public void updatePromotionAdStatus(Integer id, Integer status) {
        // 1.补全参数
        PromotionAd promotionAd = new PromotionAd();
        promotionAd.setId(id);
        promotionAd.setStatus(status);
        promotionAd.setUpdateTime(DateUtils.getCurrentTime());

        // 2.调用数据访问层对应的方法
        promotionAdMapper.updatePromotionAdStatus(promotionAd);
    }
}
