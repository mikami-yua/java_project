package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 反序列化
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("objectoutTEST_student"));
        //开始反序列化（读）
        Object obj=ois.readObject();
        System.out.println(obj.toString());
        ois.close();
    }
}
