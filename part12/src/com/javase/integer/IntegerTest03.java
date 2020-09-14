package com.javase.integer;

/**
 * int Integer String互相转换
 */
public class IntegerTest03 {
    public static void main(String[] args) {
        //string--->int
        String s1 = "100";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1+1);//101


        //int----->string
        String s2=i1+"";
        System.out.println(s2+1);//1001


        //int---->Integer
        Integer x=5000;



        //Integer----->int
        int y=x;

        //string------>Integer
        Integer k = Integer.valueOf("123");


        //Integer------>String
        String s3=String.valueOf(k);
    }
}
