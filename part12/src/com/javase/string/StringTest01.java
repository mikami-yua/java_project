package com.javase.string;

/**
 * JDK中的String类
 *  -引用数据类型
 *  -使用“”括起来的都是string对象
 *  -“”中的字符串不可变
 *  -“abc”“bcd”都是直接存储在【方法区】的【字符串常量池中】的
 *      字符串使用频繁，为了效率
 */
public class StringTest01 {
    public static void main(String[] args) {
        //下面两行创建了3个字符串对象，都在字符串常量池中
        String s1="asddaad";
        String s2="asddaad"+"xxxsa";


        //通过new创建对象
        //凡是“”中的都在字符串常量池中有一份
        //new对象时一定在堆内存中开辟空间
        String s3=new String("xy");


        //这个asddaad不会新建，s4中的指针和s1中的指针相同
        String s4="asddaad";
        System.out.println(s1==s4);//true


        //两个string对象中的指针相同，但是指向两个 string对象的指针不同
        String s5=new String("xyz");
        String s6=new String("xyz");
        System.out.println(s5==s6);//false
        System.out.println(s5.equals(s6));//true
    }
}
