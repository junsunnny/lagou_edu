package com.lagou.controller;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVo;
import com.lagou.domain.ResponseResult;
import com.lagou.service.PromotionAdService;
import com.lagou.utils.UploadImgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/promotionAD")
public class PromotionADServlet {

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
    @RequestMapping("/promotionADUpload")
    public ResponseResult courseUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        // 1.调用图片上传的方法并返回数据
        Map<String, String> resultMap = UploadImgUtils.uplaodImgMethod(file, request);
        // 2.判断返回结果是否为空 如果不为空上传成功 否则上传失败 返回null
        if (resultMap != null){
            return new ResponseResult(true,200,"图片上传成功",resultMap);
        }else{
            return null;
        }
    }
}
