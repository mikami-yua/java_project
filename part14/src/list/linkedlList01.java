package list;
/**
 * linkedlist底层是双向链表
 * 底层也有下标
 * 注意：array
 * arraylist检索效率高不是单纯下标的原因，是因为底层数组发挥的作用
 * linkedlist有下标但是效率低，因为只能从头节点开始找（一个一个遍历）
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlList01 {
    public static void main(String[] args) {
        List list1=new LinkedList();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        for (int i=0;i<list1.size();i++){
            Object obj=list1.get(i);
            System.out.println(obj);
        }

        /*
        linkedlist集合没有初始化容量
        最初在这个集合中没有任何元素，first和last都指向null
        面向接口编程，调用的方法都是接口中的方法

         */
        List list2=new ArrayList();
        list2.add("123");
        list2.add("456");
        list2.add("789");
        for (int i=0;i<list2.size();i++){
            System.out.println(list2.get(i));
        }
    }

}
