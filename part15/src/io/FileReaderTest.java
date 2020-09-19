package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader:
 *      文件字符输入流，只能读取普通文本
 */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader=null;
        try {
            //创建文件字符输入流
            reader=new FileReader("E:\\project\\myoutfile");
            //开始读
            char[] c=new char[8];//一次读取8个字符
            int readerCount=0;
            while ((readerCount=reader.read(c))!=-1){
                System.out.println(new String(c,0,readerCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
