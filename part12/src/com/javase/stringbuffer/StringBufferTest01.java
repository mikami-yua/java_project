package com.javase.stringbuffer;

/**
 * 字符串的频繁拼接
 *      -每次拼接都会产生新字符串，会占用大量方法区内存，浪费空间
 *      -使用java.lang.StringBuffer或者java.lang.StringBuilder
 *
 *      -StringBuffer底层是byte数组
 *
 *      -StringBuffer优化性能
 *          创建时尽可能给一个初始化容量
 *          减少底层数组的扩容次数
 *
 */
public class StringBufferTest01 {
    public static void main(String[] args) {

        //创建一个初始化容量16的byte数组
        StringBuffer stringBuffer = new StringBuffer();

        //以后拼接字符串使用append方法
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append(3.14);
        //追加时满了byte【】会自动扩容
        stringBuffer.append(true);

        System.out.println(stringBuffer.toString());//ab3.14true


        //指定初始化容量的
        StringBuffer stringBuffer1=new StringBuffer(100);
        stringBuffer1.append("asdadadasdada");
        stringBuffer1.append("kskaldjasldka");
        System.out.println(stringBuffer1);

    }
}
