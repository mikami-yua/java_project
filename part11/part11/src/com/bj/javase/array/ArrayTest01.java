package com.bj.javase.array;

/**
 * array
 *  1.数组是一种引用数据类型。不属于基本数据类型。父类是Object
 *  2.数组是一个容器，可以容纳多个元素
 *  3.可以存储基本数据类型/引用数据类型
 *  4.数组存储在堆内存中(引用数据类型)
 *  5.数组中如果存放的是java对象，实际上存储的是对象的内存地址
 *  6.java中数组长度不可变
 *  7.所有数组对象都要length属性，获得元素个数
 *  8.数组中元素类型统一
 *  9.数组中的元素，内存地址连续
 *  10.数组中首元素的内存地址作为整个数组对象的内存地址
 *
 *
 *  定义一个一维数组
 *      int[] array1;
 *
 *  初始化
 *      静态
 *          int[] array={100,200,300};
 *      动态
 *          int[] array=new int[5];//初始化一个5个长度的int数组，每个元素默认值0
 *          String[] name=new String[5];//初始化一个5个长度的String数组，每个元素默认值null
 *
 *
 *      创建时确定元素时采用静态初始化
 */

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] a1={1,2,34,45,56,767};
        System.out.println(a1.length);
        System.out.println(a1[0]+" "+a1[a1.length-1]);
        a1[0]=111;
        System.out.println(a1[0]);

        //遍历
        for (int i=0;i<a1.length;i++) {
            System.out.println(a1[i]);
        }



    }
}
