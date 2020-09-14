package com.bj.javase.array.arrays;

import java.util.Arrays;

/**
 *Arrays工具类
 * 所有方法都是静态的，主要用二分查找，排序
 */
public class ArraysTest02 {
    public static void main(String[] args) {
        //java.util.Arrays中参考帮助文档
        int[] arr={1,2,3,4,6,777,42,123,53,412,3,231,32,66};
        Arrays.sort(arr);
        int index= Arrays.binarySearch(arr,231);
        System.out.println(index);
    }
}
