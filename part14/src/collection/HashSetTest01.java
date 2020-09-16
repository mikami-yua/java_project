package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * hashset集合无序不可重复
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        //演示hashset特性
        Set<String> sss = new HashSet<>();

        //添加元素
        sss.add("hello1");
        sss.add("hello2");
        sss.add("hello3");
        sss.add("hello4");
        sss.add("hello5");
        sss.add("hello1");
        sss.add("hello1");
        sss.add("hello8");

        for (String s:sss){
            System.out.println(s);
        }
        /*
        hello1
        hello4
        hello5
        hello2
        hello3
        hello8
         */
    }

}
