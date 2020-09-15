package Vector;

import java.util.*;

/**
 * vector
 *  1.底层也是数组
 *  2.初始化容量:10
 *  3.扩容，每次扩容原来的二倍
 *  4.vector中所有方法都带有关键字：synchronized，是线程安全的（效率较低，用的少）
 *  5.怎么把一个线程不安全的arraylist集合转换为线程安全的：
 *      使用集合工具类：
 *          java.util.Collections;
 *          java.util.Collection 是集合接口
 *          java.util.Collections 是集合的工具类
 */
public class VectorTest01 {
    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(4);
        vector.add(5);
        Iterator it=vector.iterator();
        while(it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }

        //以后可能要使用
        List mylist=new ArrayList();
        //变成线程安全的
        Collections.synchronizedList(mylist);//这里不涉及多线程，无法演示效果
        mylist.add("111");
        mylist.add("222");
        mylist.add("333");


    }

}
