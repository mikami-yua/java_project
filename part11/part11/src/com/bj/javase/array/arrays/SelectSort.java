package com.bj.javase.array.arrays;

/**
 * 选择排序
 *  每次找出最小值
 *  把最小值放到最开始的位置
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr={3,1,6,2,5};
        for (int i=0;i<arr.length-1;i++){
            //i是参与比较的这堆数据最左边元素的下标
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]) {
                    min = j;//最小值下标改变
                }
            }
            //每次循环结束后交换位置
            if (min!=i){
                //存在更小的数据
                int temp;
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
