package com.bj.javase.array;

/**
 * main方法上的string【】
 *      jvm调用main方法时，会自动传一个string数组
 */
public class ArrayTest03 {
    public static void main(String[] args) {

        System.out.println("jvm的长度"+args.length);//jvm的长度0    args不是null

        //这个数组是留给用户的，用户在控制台上输入参数，参数自动被转换为string【】 args
    }
}
