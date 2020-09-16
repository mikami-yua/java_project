package collection;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet特点：无序不可重复，但是存储的元素可以自动按照大小排序
称为：可排序集合
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        //创建集合
        Set<String> strs=new TreeSet<>();
        strs.add("A");
        strs.add("B");
        strs.add("Z");
        strs.add("Y");
        strs.add("Z");
        strs.add("M");

        for(String s:strs){
            System.out.println(s);
        }
        /*从小到大自动排序，无序：和存放时的顺序不同
        A
        B
        M
        Y
        Z
         */
    }
}
