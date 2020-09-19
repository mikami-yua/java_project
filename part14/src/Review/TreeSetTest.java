package Review;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //集合的创建
        TreeSet<Integer> ts=new TreeSet<>(new Comparator<Integer>() {
            /**
             * 传入比较器可以改变排序规则
             * @param o1
             * @param o2
             * @return
             */
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });//treeset无序不可重复
        //添加元素
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);

        //遍历
        Iterator<Integer> it= ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());//treeset集合中元素是可排序的
        }

        for(Integer i:ts){
            System.out.println(i);
        }

    }
}
