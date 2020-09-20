package io;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * java.io.PrintStream标准字节输出流，默认输出到控制台
 */
public class PrintStreamTest {
    public static void main(String[] args) throws Exception{
        System.out.println("hello world");

        PrintStream ps=System.out;
        ps.println("hello zhang");

        //标准输出流不需要关闭
        //可以改变标准输出流的输出方向
        /*之前使用过的system类的方法和属性
        System.gc();//垃圾回收
        System.currentTimeMillis();//系统当前时间
        System.exit(0);
        System.arrayCopy()
         */
        PrintStream printStream=new PrintStream(new FileOutputStream("printstreamTest"));
        System.setOut(printStream);//标准输出流不再指向控制台，指向printstreamTest文件
        //再输出
        System.out.println("测试修改输出方向后的输出");


    }
}
