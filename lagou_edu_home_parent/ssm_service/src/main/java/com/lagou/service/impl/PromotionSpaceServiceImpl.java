package com.lagou.service.impl;

import com.lagou.dao.PromotionSpaceMapper;
import com.lagou.domain.PromotionSpace;
import com.lagou.service.PromotionSpaceService;
import com.lagou.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PromotionSpaceServiceImpl implements PromotionSpaceService {

    @Autowired
    private PromotionSpaceMapper promotionSpaceMapper;
    /**
     * 查询广告位所有信息
     *
     * @return
     */
    @Override
    public List<PromotionSpace> findAllPromotionSpace() {
        return promotionSpaceMapper.findAllPromotionSpace();
    }

    /**
     * 保存广告位信息
     *
     * @param promotionSpace
     */
    @Override
    public void savePromotionSpace(PromotionSpace promotionSpace) {
        // 1.补全需要保存的数据
        promotionSpace.setSpaceKey(UUID.randomUUID().toString());
        promotionSpace.setCreateTime(DateUtils.getCurrentTime());
        promotionSpace.setUpdateTime(DateUtils.getCurrentTime());
        promotionSpace.setIsDel(0);

        // 2.调用Dao层代码
        promotionSpaceMapper.savePromotionSpace(promotionSpace);
    }

    /**
     * 根据id回显广告位信息
     *
     * @param id
     * @return
     */
    @Override
    public PromotionSpace findPromotionSpaceById(Integer id) {
        return  promotionSpaceMapper.findPromotionSpaceById(id);
    }

    /**
     * 修改广告位信息
     *
     * @param promotionSpace
     */
    @Override
    public void updatePromotionSpace(PromotionSpace promotionSpace) {
        // 1.补全广告位信息
        promotionSpace.setUpdateTime(DateUtils.getCurrentTime());

        // 2.调用Dao层代码
        promotionSpaceMapper.updatePromotionSpace(promotionSpace);
    }
}
