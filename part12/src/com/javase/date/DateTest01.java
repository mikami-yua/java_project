package com.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 对日期的处理
 */
public class DateTest01 {
    public static void main(String[] args) throws Exception{
        //获取当前时间
        Date nowTime = new Date();
        System.out.println(nowTime);//Wed Jun 17 09:31:17 CST 2020

        //日期格式化      Date------>String
        /**
         * yyyy年
         * MM月
         * dd日
         * HH时
         * mm分
         * ss秒
         * SSS毫米
         * 其他格式随意组织
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss  SSS");
        String nowTimeStr=sdf.format(nowTime);//format返回一个日期，format中放一个Date对象
        System.out.println(nowTimeStr);

        //有一个日期字符串，转换为Date类型         String------Date
        String time="2008-08-08 08:08:08 888";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");//格式不能随便写，要和日期字符串格式相同
        Date dateTime=sdf2.parse(time);
        System.out.println(dateTime);//Fri Aug 08 08:08:08 CST 2008

    }
}
