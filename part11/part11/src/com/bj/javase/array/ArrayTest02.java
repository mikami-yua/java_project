package com.bj.javase.array;

import com.sun.org.apache.xpath.internal.objects.XString;

public class ArrayTest02 {
    //main采用c++的语法格式
    public static void main(String args[]) {
        int[] a=new int[4];
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        printArray(a);

        String[] strs={"ass","dadds","asda"};
        printArray(strs);

        //printArray({"ass","dadds","asda"});报错


    }


    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void printArray(String[] args){
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }

}
