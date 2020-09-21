package io;

import bean.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 一次序列化多个对象
 *      将对象放在集合中，序列化集合
 *  不用集合存储第二个对象就报错
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception{
        List<User> userlist=new ArrayList<>();
        userlist.add(new User(1,"zhangsan"));
        userlist.add(new User(2,"lisi"));
        userlist.add(new User(3,"wangwu"));

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("objectoutTEST_list"));
        //一次序列化一个集合
        oos.writeObject(userlist);

        oos.flush();
        oos.close();
    }
}
