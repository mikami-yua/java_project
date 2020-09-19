package Review;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> set=new HashSet<>();//hashset无序不可重复
        //添加元素
        set.add("abc");
        set.add("def");
        set.add("hjk");
        //set集合中的元素不能通过下标取。没有下标

        //遍历集合
        Iterator<String> it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());//通过.next取
        }

        for(String s:set){
            System.out.println(s);
        }


    }
}
