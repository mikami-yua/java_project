package com.javase.number;

import java.text.DecimalFormat;

/**
 * 数字格式化
 */
public class DecimalFormatTest01 {
    public static void main(String[] args) {
        //DecimalFormat负责数字格式化
        DecimalFormat df=new DecimalFormat("###,###.##");//加入千分位，保留两位小数
        String s=df.format(1234.56);
        System.out.println(s);//1,234.56

        /**
         * # 任意数字
         * ，千分位
         * . 小数点
         * 0 不够补0
         */
        DecimalFormat df1=new DecimalFormat("###,###.0000");//加入千分位，保留两位小数
        String s1=df1.format(1234.56);
        System.out.println(s1);//1,234.5600
    }
}
