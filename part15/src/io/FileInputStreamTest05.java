package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream其他常用方法
 *      int avalible():返回流中剩余没有读到的字节数量
 *      long skip()：跳过几个字节不读
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("E:\\baidudownload\\temp");
            System.out.println("总字节数量： "+fis.available());
            //读一个字节
            //int readByte=fis.read();
            //还剩下几个字节可以读？
            //System.out.println(fis.available());//20
            //有什么用，可以获取总字节数量
            //可以new一个byte数组全部读完，不需要循环,只需要读一次
            byte[] bytes=new byte[fis.available()];
            int readCount=fis.read(bytes);
            System.out.println(new String(bytes));//abcdefhaskidhiasdhksa
            //不适合大文件，byte数组不能太大

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
