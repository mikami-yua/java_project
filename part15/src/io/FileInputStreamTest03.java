package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 学习 int read(byte[] b)
 *      一次最多读取b.length个字节，减少硬盘内存交互
 *      往byte[]中读
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            //IDEA默认的当前路径是：工程project 的根目录
            fis=new FileInputStream("E:\\baidudownload\\temp");

            //读：采用byte数组，一次最多读取 数组.length 个字节
            byte[] bytes=new byte[4];//准备一个4个长度的byte数组，一次最多读4个字节
            int readCount = fis.read(bytes);//返回值是读到的字节数量（不是字节本身）
            System.out.println(readCount);//4
            //将字符数组全部转换为字符串
            //System.out.println(new String(bytes));//abcd
            //不应该全部都转换，应该是读取到多少个字节转换多少个
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);//第二次只能读取到2个字节
            System.out.println(readCount);
            //System.out.println(new String(bytes));//efcd ef替换了ab但是cd还在
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);//第三次返回-1，一个字节都没读到就返回-1
            System.out.println(readCount);




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
