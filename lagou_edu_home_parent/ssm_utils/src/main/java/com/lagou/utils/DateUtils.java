package com.lagou.utils;

import java.util.Date;

/**
 * 时间工具类
 */
public class DateUtils {
    private static Date date = new Date();
    /**
     * 获取当前系统时间
     */
    public static Date getCurrentTime(){
        // 1.获取当前系统时间的毫秒值
        long timeMillis = System.currentTimeMillis();
        // 2.将毫秒值传入Date对象中进行封装
        date.setTime(timeMillis);
        return date;
    }
}
