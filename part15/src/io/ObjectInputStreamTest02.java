package io;

import bean.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * 反序列化一个集合
 */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("objectoutTEST_list"));
        Object obj=ois.readObject();
        System.out.println(obj instanceof List);
        List<User> userList=(List<User>)obj;
        for(User user:userList){
            System.out.println(user.toString());
        }

        ois.close();
    }
}
