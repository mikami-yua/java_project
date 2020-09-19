package io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter:
 *      文件字符输出流，负责写。
 *      只能输出普通文本
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter out=null;
        try {
            //创建文件字符输出流对象
            out=new FileWriter("filewriter");
            //开始写
            char[] c={'我','是','中','国','人'};
            out.write(c);
            out.write(c,2,3);//我是中国人中国人

            out.write(" +这是直接追加一个字符串");
            out.write('\n');
            out.write(" +这是测试换行符");

            //写文件一定记得刷新
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
