package com.javase.integer;

import com.sun.javaws.IconUtil;

/**
 * 8种基本数据类型，Java准备了8种包装类型。8种包装类属于引用数据类型，父类object
 *
 * 提供8种包装类的原因：8种基本数据类型不够用
 *
 * 基本数据类型                       包装类型
 * -------------------------------------------
 * byte                             java.lang.Byte
 * short                            java.lang.Short
 * int                              java.lang.Integer
 * long                             java.lang.Long
 * float                            java.lang.Float
 * double                           java.lang.Double-------------以上父类是number
 * boolean                          java.lang.Boolean------------以下父类是Object
 * char                             java.lang.Character
 *
 * Number是一个抽象类无法实例化
 *
 */
public class IntegerTest01 {
    public static void main(String[] args) {
        //需求，调用doSome时需要传一个数字，但数字是基本数据类型
        //doSome不能接收基本数据类型的数字
        //传一个数字对应的包装类

        //基本数据类型转为引用数据类型（通过包装）----------------->装箱
        Integer i = new Integer(123);

        //引用数据类型转换为基本数据类型--------------------------》拆箱
        float f = i.floatValue();
        System.out.println(f);

        //引用数据类型转换为基本数据类型
        int retv=i.intValue();
        System.out.println(retv);


        //自动装箱，拆箱
        //Number种的方法就不需要学习了
        Integer x=100;//自动装箱
        int y=x;//自动拆箱
        System.out.println(x+" "+y+" "+(x+1));//加号两边要求是基本数据类型，x不是基本数据类型会进行自动拆箱

        Integer a=1000,b=1000;
        System.out.println(a==b);//false------双等号不会触发拆箱

        /**
         * java为了提高效率，将【-128，127】之间的所有包装对象提前创建
         * 放在一个方法区的“整数常量池”中，目的是只要用这个区间的数据，不需要再new，直接取
         */
        Integer c=127;
        Integer d=127;
        System.out.println(c==d);//true---------c，d中保存变量的内存地址是相同的


    }

    public static void doSome(Object obj){
        System.out.println(obj);
    }
}
