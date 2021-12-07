package com.lagou.controller;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVo;
import com.lagou.domain.ResponseResult;
import com.lagou.service.PromotionAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/promotionADServlet")
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
        try {
            // 1.判断文件是否为空
            if(file.isEmpty()) {
                throw new RuntimeException();
            }
            // 2.获取项目部署路径
            String realPath = request.getServletContext().getRealPath("/");
            System.out.println(realPath);
            //
            String webappPath = realPath.substring(0, realPath.indexOf("ssm_web_war"));

            // 3.获取源文件名
            String fileName = file.getOriginalFilename();

            // 4.新文件名
            String newFileName = System.currentTimeMillis() + fileName.substring(fileName.lastIndexOf("."));

            // 5.上传文件
            String uploadPath = webappPath + "upload\\";
            File filePath = new File(uploadPath, newFileName);

            //如果目录不存在就创建目录
            if (!filePath.getParentFile().exists()){
                filePath.getParentFile().mkdirs();
                System.out.println("创建目录:" + filePath);
            }
            file.transferTo(filePath);

            // 6.将文件名和文件路径返回
            Map<String,String> map = new HashMap<>();
            map.put("fileName",newFileName);
            map.put("filePath", "http://localhost:8080/upload/" + newFileName);
            return new ResponseResult(true,200,"succse",map);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
