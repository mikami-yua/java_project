package io;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 带有缓冲区的字符输入流
 *
 * 使用这个流的时候不需要定义byte【】 或char【】，自带缓冲
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception{

        FileReader reader=new FileReader("src\\exception\\ExceptionTest01.java");
        //当一个流的构造方法中，需要一个流的时候，这个被传进来的流被称为节点流
        //外部负责包装的这个流称为：包装流/处理流
        /*
        FileReader就是节点流
        BufferedReader包装流
         */
        BufferedReader br= new BufferedReader(reader);

        //读一行
        String firstline= br.readLine();
        System.out.println(firstline);

        String secondline= br.readLine();
        System.out.println(secondline);

        String thridline= br.readLine();
        System.out.println(thridline);

        //读取一个文本行但是不带换行符
        String s=null;
        while ((s=br.readLine()) !=null){
            System.out.println(s);
        }
        //关闭流
        //对于包装流来说，只需呀关闭最外层流就行，里面的节点流会自动关闭
        br.close();
    }
}
