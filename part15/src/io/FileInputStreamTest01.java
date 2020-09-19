package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * java.io.FileInputStream：
 *  1.文件字节输入流，万能的任何文件都可以采用这个流来读
 *  2.字节的方式完成输入的操作，完成读的操作（硬盘------》内存）
 *  3.
 */
public class FileInputStreamTest01 {
    //文件路径E:\baidudownload\temp
    public static void main(String[] args) {
        FileInputStream fis=null;//为了在finally中也可以使用fis

        try {//FileInputStream对象有一个编译时异常需要开发者try  catch

            //1.创建文件字节输入流对象
            //文件路径：E:\baidudownload\temp（IDEA自动变成两个\\,因为java中\表示转义）.用/也可以
            fis=new FileInputStream("E:\\baidudownload\\temp");

            //2.读
            int readData=fis.read();//方法的返回值是读取到的字节本身
            System.out.println(readData);//97,a对应的字节是97

            readData=fis.read();//每调用一次read文件指针向后移动一个字节，并返回当前指向的字节
            System.out.println(readData);//98

            readData=fis.read();//每调用一次read文件指针向后移动一个字节，并返回当前指向的字节
            System.out.println(readData);//99

            readData=fis.read();//每调用一次read文件指针向后移动一个字节，并返回当前指向的字节
            System.out.println(readData);//100

            readData=fis.read();//每调用一次read文件指针向后移动一个字节，并返回当前指向的字节
            System.out.println(readData);//101

            readData=fis.read();//每调用一次read文件指针向后移动一个字节，并返回当前指向的字节
            System.out.println(readData);//102

            //再调read方法，指针向后再走一位，已经到文件末尾，返回-1
            readData=fis.read();//每调用一次read文件指针向后移动一个字节，并返回当前指向的字节
            System.out.println(readData);//-1
            readData=fis.read();//每调用一次read文件指针向后移动一个字节，并返回当前指向的字节
            System.out.println(readData);//-1
            readData=fis.read();//每调用一次read文件指针向后移动一个字节，并返回当前指向的字节
            System.out.println(readData);//-1
            //之后再读永远是-1，因为已经到了末尾，读取不到任何数据

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {//不管是否有异常流都要关闭，故最后加一个finally
            if (fis != null) {
                //关闭流的前提，流不为空，避免空指针异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
