package com.javase.enum2;

/**
 *不使用枚举
 * 设计缺陷：返回值类型，返回int不恰当，最好使用boolean
 *
 */
public class EnumTest01 {
    public static void main(String[] args) {
        int ret1=divide(10,2);
        System.out.println(ret1);//1

        int ret2=divide(10,0);
        System.out.println(ret2);//0

        Result ret3=divide2(10,0);
        System.out.println(ret3);//FAIL

    }

    /**
     *计算商 成功返回1，失败返回0
     * @param a
     * @param b
     * @return
     */
    public static int divide(int a,int b){
        try{
            int c=a/b;
            //程序执行至此表示没有发生异常,执行成功返回1
            return 1;
        }catch (Exception e){
            //程序执行至此表示发生异常,执行失败返回0
            return 0;
        }

    }
    /**
     *计算商 Result.SUCCESS成功
     * @param a
     * @param b
     * @return
     */
    public static Result divide2(int a,int b){
        try{
            int c=a/b;
            //程序执行至此表示没有发生异常,执行成功返回1
            return Result.SUCCESS;
        }catch (Exception e){
            //程序执行至此表示发生异常,执行失败返回0
            return Result.FAIL;
        }

    }

}

//采用枚举方式
//枚举编译之后也是生成class文件
//枚举也是引用数据类型
//枚举中每个值可以看作常量
enum Result{
    SUCCESS,FAIL
}