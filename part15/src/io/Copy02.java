package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用filereader 和filewriter拷贝只能拷贝普通文本文件
 *
 * 能用记事本编辑的都是普通文本文件
 */
public class Copy02 {
    public static void main(String[] args) {
        FileReader in=null;
        FileWriter out=null;
        try {
            //读
            in=new FileReader("src\\exception\\ExceptionTest01.java");
            //写
            out=new FileWriter("copytest");

            //边读边写
            char[] c=new char[1024*512];//1M
            int readCount=0;
            while ((readCount=in.read(c)) != -1){
                out.write(c,0,readCount);
            }



            //写结束刷新
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out == null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

/*
gitceshi
 */
