package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *文件字节输出流
 * 从内存到硬盘
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            //这种方式谨慎使用，这种方式会先将源文件清空再写入
            //fos=new FileOutputStream("myoutfile");//写到了part13下

            //以追加的方式在文件末尾写入
            fos=new FileOutputStream("myoutfile",true);
            //开始写
            byte[] bytes={97,98,99,100,101,102,103};
            fos.write(bytes);//将byte数组全部写出  abcdefg

            fos.write(bytes,0,2);//byte写入一部分  abcdefgab

            String s="会加速后代u好的";
            byte[] bs=s.getBytes();
            fos.write(bs);



            //写完之后最后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
