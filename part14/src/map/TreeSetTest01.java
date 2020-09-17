package map;

import java.util.TreeSet;

/**
 * 1.Treeset集合底层实际是treemap
 * 2.treemap集合底层是一个二叉树
 * 3.放到treeset中的元素，等同于放到treemap集合的key部分
 * 4.treeset集合中的元素：无序不可重复，但是可以按照元素的大小顺序自动排序
 *      称为：可排序集合
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        //创建一个Treeset集合
        TreeSet<String> ts=new TreeSet<>();
        //添加元素
        ts.add("zhangsan");
        ts.add("zhangsss1");
        ts.add("zhangsss4");
        ts.add("zhangsss2");
        ts.add("zhangsss3");
        ts.add("zhangsss5");
        //遍历
        for(String s:ts){//字典顺序升序
            System.out.println(s);
        }
        /*输出结果
        zhangsan
        zhangsss1
        zhangsss2
        zhangsss3
        zhangsss4
        zhangsss5
         */



    }
}
