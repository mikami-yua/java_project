package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用fileinputstream和fileoutputstream完成文件的拷贝
 * 拷贝的过程是一边读一边写
 * 使用字节流拷贝文件内容的时候，文件类型随意
 *
 */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            //创建输入流对象
            //E:\【2019英语六级】英语六级500分备考之路，短时间快速提高英语听力能力\1.1(Av52551559,P1)
            fis=new FileInputStream("E:\\【2019英语六级】英语六级500分备考之路，短时间快速提高英语听力能力\\1.1(Av52551559,P1).mp4");
            //创建输出流对象
            fos=new FileOutputStream("E:\\1.1(Av52551559,P1).mp4");

            //核心：一遍读，一遍写
            byte[] bs=new byte[1024*1024];//1024个字节是1kb，1024个字节是1M。一次拷贝1M
            int readCount=0;
            while ((readCount=fis.read(bs))!=-1){
                fos.write(bs,0,readCount);
            }


            //输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();//一起try catch，上面的出异常下面的就关不了了
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
