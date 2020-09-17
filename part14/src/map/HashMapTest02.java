package map;

import java.util.HashSet;
import java.util.Set;

/**
 * 向map中存，以及从map中取，都是先调用key的hashcode方法，然后再调用equals方法
 * equals方法有可能调用也有可能不调用
 *
 * 一个类的equals方法重写了，hashcode方法必须重写
 *  并且，如果equals返回true，hashcode返回的值必须相同
 *
 * hashcode方法和equals方法直接使用IDEA工具生成，但是需要同时生成
 *
 * 【终极结论】：
 *      放在hashmap k部分的，以及放在hashset集合中的元素，需要同时重写hashcode方法和equals方法
 */
public class HashMapTest02 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan");
        Student s2=new Student("zhangsan");
        System.out.println(s1.equals(s2));//false重写equals之前
        //重写equals方法之后true

        System.out.println("s1的hashcode="+s1.hashCode());
        System.out.println("s2的hashcode="+s2.hashCode());
        /*
        s1的hashcode=189568618
        s2的hashcode=666641942
         */
        //往hashset集合中放的话，因为hashcode不同所以依然可以放两个
        Set<Student> students=new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());//2
        //不符合hashset集合存储特点
        /*
        重写hashcode之后的输出
        true
        s1的hashcode=-1432604525
        s2的hashcode=-1432604525
        1
         */
    }
}
