package com.javase.string;

public class StringTest03 {
    public static void main(String[] args) {
        //string类中的常用方法

        //返回指定索引处的char值
        char c1="中国人".charAt(1);
        System.out.println(c1);//国

        //按字典顺序比较两个字符串-----字符串第一个和第一个比，再比第二个，不同就不比了
        int result1="abc".compareTo("abc");
        System.out.println(result1);//0--------------前后一致
        int result2="abcd".compareTo("abce");
        System.out.println(result2);//-1------------前小后大
        int result3="abce".compareTo("abcd");
        System.out.println(result3);//1-------------前大后小

        //判断前面的字符串是否有后面的子字符串
        System.out.println("hellowold.java".contains(".java"));

        //判断是否以xxxxx结尾
        System.out.println("test.txt".endsWith(".txt"));

        //判断字符串是否相等，忽略大小写
        System.out.println("ABC".equalsIgnoreCase("abc"));

        //把字符串对象转换成字节数组
        byte[] bytes="abcdefg".getBytes();
        for(int i=0;i<bytes.length;i++) {
            System.out.println(bytes[i]);
        }

        //返回某个子字符串在当前字符串中第一次出现处的索引
        System.out.println("asdadadjasdiahdi".indexOf("da"));//2

        //判断字符串是否为空
        String s="";
        System.out.println(s.isEmpty());

        //返回字符串长度---------------判断数组长度是属性没有（）,字符串是length方法
        System.out.println("abc".length());//3

        //返回某个子字符串在当前字符串中最后一次出现处的索引
        System.out.println("asjdakshdauidhas".lastIndexOf("as"));//14

        //替换子字符串
        System.out.println("http://www.baidu.com".replace("http://","https://"));

        //拆分字符串
        String[] ymd="1980-1-1".split("-");
        for(int i=0;i<ymd.length;i++) {
            System.out.println(ymd[i]);
        }

        //判断是否以某个子字符串开始
        System.out.println("http://www.baidu.com".startsWith("http"));

        //截取字符串
        System.out.println("http://www.baidu.com".substring(7));//www.baidu.com
        System.out.println("http://www.baidu.com".substring(7,10));//www

        //字符串转换成char数组
        char[] chars="张三你好".toCharArray();
        for(int i=0;i<chars.length;i++) {
            System.out.println(chars[i]);
        }

        //转换为小写
        System.out.println("ABCDEFG".toLowerCase());

        //转为大写
        System.out.println("abcdefg".toUpperCase());

        //去除字符串前后空白
        System.out.println("     abcdefg    sada  ".trim());

        //String中只有一个方法是静态的不需要new对象 valueOf
        //将非字符串转为字符串
        String s1=String.valueOf(true);
        System.out.println(s1);




    }
}
