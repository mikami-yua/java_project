package com.bj.javase.array.arrays;

import java.util.Arrays;

/**
 *数组工具类：java.util.Arrays
 *
 */
public class ArraysTest01 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,777,42,123,53,412,3,231,32,66};

        //排序
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
