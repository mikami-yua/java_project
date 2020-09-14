package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**   异常只处理编译时异常且必须处理，运行时异常可处理可不处理
 * p166 0.55
 * 处理异常的第一种方式-----------上报
 *      在方法声明的位置使用throws关键字，抛出，抛给调用者处理
 * 第二种方式：
 *      try。。。catch进行异常捕捉
 *      异常不会上报，自己进行处理
 *
 * 异常采用上报的方式，此方法的后续代码不会执行--------------方法体中代码出现异常如果上报，此方法结束
 * 异常采用捕捉的方式，后续代码一定会执行
 * try语句块出现异常，try中的后续代码不会执行
 *
 * 以后的开发中出现异常，应该上报还是捕捉
 *      如果希望调用者处理上报
 *      其他情况都是try。。。catch
 */
public class ExceptionTest04 {
    //一般不在main上使用throws，一旦发生抛给JVM，JVM只能终止
    //异常处理的作用是增强健壮性，发生异常也不会影响程序的运行
    public static void main(String[] args) {
        try {
            //尝试
            m1();
            //以上代码出现异常，直接进入catch语句块执行
            System.out.println("hello");
        } catch (FileNotFoundException e) {//这个分支可以使用e引用，保存的内存地址是new出来的异常对象的内存地址
            //捕捉异常后走的分支
            System.out.println(e);//java.io.FileNotFoundException: E:\javase\not\学习方法.txt (系统找不到指定的路径。)
            System.out.println("文件找不到，可能路径写错了");
        }
        //try。。。catch异常抓住之后，代码会继续执行
        System.out.println("main over");//一定会执行，不管有没有异常
    }

    public static void m1() throws FileNotFoundException {
        m2();
    }

    //public static void m2() throws IOException {//抛FileNotFoundException的父类IOException可以。因为IOException包括FileNotFoundException
    //public static void m2() throws Exception { //这样也可以，因为Exception 包括所有异常
    //public static void m2() throws ClassCastException,FileNotFoundException{//throws后面可以写多个异常
    public static void m2() throws FileNotFoundException {
        //调用m3，未对异常进行预处理
        m3();//alt+回车自动生成
    }

    public static void m3() throws FileNotFoundException {
        //调用JDK中某个类的构造方法
        /**
         * 编译报错的原因
         *  1。这里调用了一个构造方法
         *  2.构造方法的声明位置有throws FileNotFoundException
         *  3.通过类的继承FileNotFoundException的父类是IOException，IOException的父类是Exception
         *  最终得知FileNotFoundException是编译时异常
         *
         *  错误原因：编译时异常要求开发者编写程序阶段必须对其进行处理，不处理就报错
         */
        //new FileInputStream("E:\\javase\\note\\学习方法.txt");//创建一个输入流对象，该流指向文件


        //采用第一种错误处理方式，在方法声明处使用throws
        new FileInputStream("E:\\javase\\not\\学习方法.txt");
    }
}
