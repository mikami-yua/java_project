package com.bj.javase.array;

import java.awt.*;

/**
 * p80数组扩容
 *  -先新建一个大容量数组，再拷贝
 *  -效率低，开发中尽可能少拷贝数组
 */
public class ArrayTest06 {
    public static void main(String[] args) {
        //数组拷贝-5个参数:源 源的起点 目标 目标的起始下标 长度
        //System.arraycopy();
        int[] src={1,11,22,3,4};

        int[] dest=new int[20];

        System.arraycopy(src,1,dest,3,2);

        for (int i=0;i<dest.length;i++){
            System.out.println(dest[i]);
        }

        String[] strs={"hello","world","java"};
        String[] newstrs=new String[20];
        System.arraycopy(strs,0,newstrs,0,strs.length);
        for (int i=0;i<newstrs.length;i++){
            System.out.println(newstrs[i]);
        }
        //拷贝的是地址，不是对象

    }




}
