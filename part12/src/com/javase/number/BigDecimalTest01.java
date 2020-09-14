package com.javase.number;

import java.math.BigDecimal;

/**
 * 精度极高
 * 专用于财务软件
 */
public class BigDecimalTest01 {
    public static void main(String[] args) {
        BigDecimal v1=new BigDecimal(100);//精度极高的100
        BigDecimal v2=new BigDecimal(200);//精度极高的200
        //求和
        BigDecimal v3=v1.add(v2);
        System.out.println(v3);
    }
}
