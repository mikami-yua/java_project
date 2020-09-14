package com.javase.random;

import java.util.Arrays;
import java.util.Random;

public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr=new int[5];
        for (int i=0;i<arr.length;i++) {
            arr[i] = -1;
        }

        int index=0;

        while (index<arr.length){
            int num=random.nextInt(101);
            if (!contains(arr,num)){
                arr[index]=num;
                index++;
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    //判断数组中是否包含某个元素
    public static boolean contains(int[] arr,int key){
        /*//对数组升序
        Arrays.sort(arr);
        //二分查找
        return Arrays.binarySearch(arr,key)>=0;*/

        for (int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;

    }
}
