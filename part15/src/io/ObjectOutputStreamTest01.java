package io;

/**
 * 参与序列化和反序列化的对象必须实现implements Serializable接口
 *      通过源代码发现implements Serializable只是标志接口，里面没有代码，起到标识的作用
 *      jvm看到这个类实现了这个接口，可能会有特殊待遇。jvm看到这个接口后会为该类，自动生成一个序列化版本号
 *
 *      序列化版本号作用：
 *
 */

import bean.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception{
        Student s=new Student(11111,"zhangsan");
        //序列化
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("objectoutTEST_student"));
        //序列化对象
        oos.writeObject(s);//直接写报错，student类不支持序列化

        //刷新
        oos.flush();
        //关闭
        oos.close();
    }
}
