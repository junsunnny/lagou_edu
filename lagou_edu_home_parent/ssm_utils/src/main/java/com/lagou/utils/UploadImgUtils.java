package com.lagou.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 图片上传工具类
 */

public class UploadImgUtils {
    /**
     * 图片上传功能
     * @param file
     * @param request
     * @return
     */
    public static Map<String,String> uplaodImgMethod(MultipartFile file, HttpServletRequest request){
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
            return map;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
