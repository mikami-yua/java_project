package com.javase.random;

import java.util.Random;

/**
 * 随机数
 */
public class RandomTest01 {
    public static void main(String[] args) {
        Random random = new Random();
        int num1=random.nextInt();
        System.out.println(num1);//随机产生一个int类型取值范围内的数字

        int num2=random.nextInt(101);
        System.out.println(num2);//随机产生0-100之间的随机数，不产生101



    }
}
