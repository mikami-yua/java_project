package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 对test01进行改进，循环方式
 *
 * 程序缺点：
 *      一次读取一个byte，内存和硬盘交互太频繁。
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("E:\\baidudownload\\temp");
            //开始读
            /*
            while (true){
                int readData=fis.read();
                if(readData==-1)
                    break;
                System.out.println(readData);
            }

             */

            //改造while
            int readDate=0;
            while ((readDate=fis.read()) != -1){
                System.out.println(readDate);
            }

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
