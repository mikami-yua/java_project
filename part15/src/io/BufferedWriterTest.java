package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/**
 * BufferWriter:带有缓冲的字符输出流
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws Exception{
        //BufferedWriter out=new BufferedWriter(new FileWriter("filkewritertest"));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("filkewritertest2")));
        out.write("hello");
        out.write("\n");
        out.write("kitty");
        out.flush();
        out.close();
    }
}
