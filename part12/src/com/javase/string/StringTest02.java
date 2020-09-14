package com.javase.string;

/**
 * String类中的构造方法
 */
public class StringTest02 {
    public static void main(String[] args) {
        //几个常用的

        //最常用
        String s1="hello";

        //
        byte[] bytes={97,98,99};//97 is 'a'
        String s2=new String(bytes);
        System.out.println(s2);//abc

        //parm1数组  parm2起始位置    parm3长度
        String s3=new String(bytes,1,2);
        System.out.println(s3);


        char[] chars={'张','三','你','好','吗'};
        //char数组全部转换为字符串
        String s4=new String(chars);
        System.out.println(s4);
        //char数组部分转换为字符串
        String s5=new String(chars,2,3);
        System.out.println(s5);

    }
}
