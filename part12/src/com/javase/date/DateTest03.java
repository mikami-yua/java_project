package com.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        Date time=new Date(1);//参数是一个毫秒------》    创建对象1970-01-01 00：00：00 001
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss  SSS");
        String nowTimeStr=sdf.format(time);
        System.out.println(nowTimeStr);//1970-01-01  08:00:00  001    北京东8区

        //sdf是一个日期格式对象，更新里面的日期通过format方法，format方法的参数是一个Date类型的对象，返回一个string
        //获取昨天此时的时间
        Date time2=new Date(System.currentTimeMillis()-1000*60*60*24);
        String yesterdayTime=sdf.format(time2);
        System.out.println(yesterdayTime);//2020-06-16  10:04:40  689

    }
}
