package map;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet集合中元素可排序的第二种方式：使用比较器
 * 最终结论：
 *  Treeset或者treemap集合key部分的元素要想得到排序，包括两种方式
 *      1.实现comparable是java.lang包下的接口
 *      2.在构造treeset或者treemap集合的时候给他传一个比较器对象
 *
 * comparable comparator 怎么选
 *      如果比较规则不变用comparable接口
 *      比较规则有多个，并且需要多个规则之间切换，使用comparator接口
 */
public class TreeSetTest04 {
    public static void main(String[] args) {
        //创建TreeSet的时候需要使用比较器
        //TreeSet<Wugui> wug=new TreeSet<>();这样不行，没有通过构造方法传递一个比较器进去
        TreeSet<Wugui> wug=new TreeSet<>(new WuguiComparator());
        wug.add(new Wugui(1000));
        wug.add(new Wugui(10));
        wug.add(new Wugui(130));
        wug.add(new Wugui(800));
        wug.add(new Wugui(700));
        wug.add(new Wugui(150));

        for(Wugui w:wug){
            System.out.println(w);
        }

    }
}

class Wugui{
    int age;

    public Wugui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "乌龟{" +
                "age=" + age +
                '}';
    }

}

/*
单独实现一个比较器
比较器实现comparator接口
【注意】comparable是java.lang包下的，comparator是java.util包下的
 */
class WuguiComparator implements Comparator<Wugui>{

    /**
     * 指定比较规则，按照年龄排序
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Wugui o1, Wugui o2) {
        return o1.age-o2.age;
    }
}
