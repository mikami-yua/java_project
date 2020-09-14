package com.javase.integer;

/**
 *Integer两种构造方法
 * Integer（int）
 * Integer（String）
 */
public class IntegerTest02 {
    public static void main(String[] args) {
        Integer integer = new Integer(100);
        Integer integer1 = new Integer("123");
        System.out.println(integer+" "+integer1);

        Double d = new Double(234);
        Double d1 = new Double("256");
        System.out.println(d+" "+d1);



        //最大最小值
        System.out.println("int type Max = "+ Integer.MAX_VALUE);
        System.out.println("int type Min = "+ Integer.MIN_VALUE);
        System.out.println("byte type Max = "+Byte.MAX_VALUE);


        Integer x = new Integer(1000);
        //Integer y = new Integer("中文");//编译没问题，运行出错java.lang.NumberFormatException




        //常用方法

        //静态方法
        int retv = Integer.parseInt("123");//String 转 int
        System.out.println(retv + 100);
        double dd = Double.parseDouble("3.14");
        System.out.println(dd+1);

        //了解进制转换
        System.out.println(Integer.toBinaryString(3));//11-----2进制
        System.out.println(Integer.toHexString(16));//10-------16进制
        System.out.println(Integer.toOctalString(8));//10------8进制
        

    }
}
