package com.javase.stringbuilder;

/**
 * StringBuilder初始化容量也是16
 *
 * StringBuffer和StringBuilder的区别
 *      StringBuffer都有synchronized关键字，表示在多线程环境是安全的
 *      StringBuilder都没有synchronized关键字，表示在多线程环境是不安全的
 *
 *      StringBuffer是线程安全的
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder();
    }
}
