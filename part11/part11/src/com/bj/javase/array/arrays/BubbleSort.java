package com.bj.javase.array.arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={9,8,10,7,6,0,11};
        for (int i=arr.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    //交换位置
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
