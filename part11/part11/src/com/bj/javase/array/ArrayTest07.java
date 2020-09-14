package com.bj.javase.array;

/**
 * 二维数组-------特殊的一维数组
 *      -二维数组初始化
 *          静态：int[][] array={{1,2,3},
 *                 {3,5,6},
 *                 {7,8,9}
 *                 };
 *          动态：int[][] array1=new int[3][4];
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        int[][] array={{1,2,3},
                {3,5,6},
                {7,8,9}
        };
        int[][] array1=new int[3][4];
        System.out.println(array.length+" "+array[1].length);//3-----有三个一维数组

        //读 改
        //取第一个一维数组
        int[] a0=array[0];
        System.out.println(a0[0]);
        System.out.println(array[0][0]);

        System.out.println("=======================================================");
        //遍历
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println();

        //方法参数是二维数组
        System.out.println("=======================================================");
        printArray(array);


    }
    public static void printArray(int[][] array){
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
        }

    }
}
