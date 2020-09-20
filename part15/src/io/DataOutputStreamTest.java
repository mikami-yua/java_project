package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * java.io.DataOutputStream数据专属的流
 * 这个流可以将数据连同数据的类型一并写入文件
 * 这个文件不是普通文本文档
 */
public class DataOutputStreamTest {
    public static void main(String[] args) throws Exception{
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("dataoutputstreamTest"));
        //写数据
        byte b=100;
        short s=200;
        int i=300;
        long l=400;
        float f=5.0F;
        double d=6.00066;
        boolean sex=false;
        char c='a';
        //写
        dos.writeByte(b);//把数据和数据的类型一并写入
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(sex);
        dos.writeChar(c);


        //刷新
        dos.flush();
        //关闭
        dos.close();
    }
}
