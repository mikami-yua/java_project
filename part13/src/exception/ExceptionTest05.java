package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 深入try。。。catch
 *      catch（）中可以是具体的异常类型，也可以是异常的父类型
 *      catch可以写多个，建议精确写，有利于程序的调试--------从上到下必须遵循从小到大
 *              可以
 *         try {
 *             //创建流
 *             FileInputStream fis = new FileInputStream("E:\\javase\\not\\学习方法.txt");
 *             fis.read();//读文件
 *         }catch (Exception e){//Exception包括FileNotFoundException和IOException
 *             System.out.println("文件不存在");
 *         }
 */
public class ExceptionTest05 {
    public static void main(String[] args) {
        /*
        try {
            FileInputStream fis = new FileInputStream("E:\\javase\\not\\学习方法.txt");
        }catch (FileNotFoundException e){
            System.out.println("文件不存在");
        }
         */
        /*
        try {
            FileInputStream fis = new FileInputStream("E:\\javase\\not\\学习方法.txt");
        }catch (IOException e){//多态 IOException e=new FileNotFoundException（）
            System.out.println("文件不存在");
        }

         */

        /*
        try {
            FileInputStream fis = new FileInputStream("E:\\javase\\not\\学习方法.txt");
        }catch (Exception e){//多态 Exception e=new FileNotFoundException（）
            System.out.println("文件不存在");
        }

         */
        try {
            //创建流
            FileInputStream fis = new FileInputStream("E:\\javase\\not\\学习方法.txt");
            fis.read();//读文件
        }catch (FileNotFoundException e){//多态 Exception e=new FileNotFoundException（）
            System.out.println("文件不存在");
        }catch (IOException e){
            System.out.println("读文件错误");
        }

        /*编译报错
        try {
            //创建流
            FileInputStream fis = new FileInputStream("E:\\javase\\not\\学习方法.txt");
            fis.read();//读文件
        }catch (IOException e){
            System.out.println("读文件错误");
        }catch (FileNotFoundException e){//多态 Exception e=new FileNotFoundException（）
            System.out.println("文件不存在");
        }

         */

    }
}














