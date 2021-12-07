package com.lagou.controller;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVo;
import com.lagou.domain.ResponseResult;
import com.lagou.service.PromotionAdService;
import com.lagou.utils.UploadImgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/promotionAd")
public class PromotionAdController {

    @Autowired
    private PromotionAdService promotionAdService;

    @RequestMapping("/findAllPromotionAdByPage")
    public ResponseResult findAllPromotionAdByPage(PromotionAdVo promotionAdVo){
        // 1.调用业务层方法
        PageInfo<PromotionAd> allPromotionAdByPage = promotionAdService.findAllPromotionAdByPage(promotionAdVo);
        return new ResponseResult(true,200,"广告分页查询成功",allPromotionAdByPage);
    }

    /**
     * 图片上传
     * @return 前台需要的JSON字符串信息
     */
    @RequestMapping("/promotionAdUpload")
    public ResponseResult promotionAdUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        // 1.调用图片上传的方法并返回数据
        Map<String, String> resultMap = UploadImgUtils.uplaodImgMethod(file, request);
        // 2.判断返回结果是否为空 如果不为空上传成功 否则上传失败 返回null
        if (resultMap != null){
            return new ResponseResult(true,200,"图片上传成功",resultMap);
        }else{
            return null;
        }
    }

    /**
     * 新增或修改广告信息
     * @param promotionAd
     * @return
     */
    @RequestMapping("/saveOrUpdatePromotionAd")
    public ResponseResult saveOrUpdatePromotionAd(@RequestBody PromotionAd promotionAd){
        if (promotionAd.getId() != 0){
            promotionAdService.updatePromotionAd(promotionAd);
            return new ResponseResult(true,200,"修改广告信息成功",null);
        }else {
            promotionAdService.savePromotionAd(promotionAd);
            return new ResponseResult(true,200,"保存广告信息成功",null);
        }
    }

    /**
     * 回显广告信息
     * @param id
     * @return
     */
    @RequestMapping("/findPromotionAdById")
    public ResponseResult findPromotionAdById(Integer id) {
        PromotionAd promotionAdById = promotionAdService.findPromotionAdById(id);
        return new ResponseResult(true,200,"回显广告信息成功", promotionAdById);
    }

    /**
     * 修改广告上下线
     * @param id
     * @param status
     * @return
     */
    @RequestMapping("/updatePromotionStatus")
    public ResponseResult updatePromotionStatus(Integer id, Integer status) {
        promotionAdService.updatePromotionAdStatus(id, status);
        return new ResponseResult(true, 200, "广告状态修改成功", null);
    }

}
