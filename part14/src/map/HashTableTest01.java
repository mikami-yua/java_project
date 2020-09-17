package map;

import java.util.Hashtable;
import java.util.Map;

/**
 * hashtable的key可以为null吗
 *  hashtable key和value都不能为null，hashmap的都可以
 *
 * hashtable方法都带有 synchronized 线程安全的
 * 线程安全有其他的方案，这个hashtable对线程的处理导致效率较低，使用不多了
 *
 * hashtable和hashmap一样，底层都是hash表数据结构
 *  hashtable：初始化容量11，默认加载因子0.75
 *              扩容：原容量的2倍+1
 */
public class HashTableTest01 {
    public static void main(String[] args) {
        Map map=new Hashtable();
        //map.put(null,123);//java.lang.NullPointerException
        //map.put(100,null);//java.lang.NullPointerException

    }
}
