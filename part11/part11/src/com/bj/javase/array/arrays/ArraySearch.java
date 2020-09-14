package com.bj.javase.array.arrays;

/**
 * 二分查找
 */
public class ArraySearch {
    public static void main(String[] args) {
        int[] arr={100,200,230,235,600,1000,2000,999};

        //target=200
        int index=binarySearch(arr,1000);
        System.out.println(index==-1?"该元素不存在":"该元素下标为"+index);

    }

    /**
     * 从数组中查找目标元素的下标
     * @param arr   被查找数组（已排序）
     * @param dest  目标元素
     * @return      -1表示该元素不存在，其他返回结果表示目标元素的下标
     */
    public static int binarySearch(int[] arr,int dest){
        //开始下标
        int begin=0;
        //结束下标
        int end=arr.length-1;

        while(begin<=end){
            //中间下标
            int mid = (begin + end) / 2;
            if (arr[mid] == dest) {
                return mid;
            } else if (arr[mid] < dest) {
                //目标在右侧
                begin = mid + 1;

            } else {//arr[mid]<dest
                //目标在左侧
                end = mid - 1;

            }
        }
        return -1;

    }
}
