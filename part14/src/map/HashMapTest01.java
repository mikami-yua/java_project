package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *hashmap集合
 *  1.集合底层是一种叫hash表的数据结构
 *      hash表=数组+单项链表
 *      充分发挥数组和单向链表各自的优点（数组：查询快   单向链表：增删快）
 *  2.底层源代码
 *      public class HashMap{
 *          //hashmap底层是一个一维数组
 *          Node<K,V>[] table;
 *          //静态内部类：HashMap.Node
 *          static class Node<K,V> implements Map.Entry<K,V>{
 *              final int hash;//哈希值，是key的hashcode（）的执行结果。hash值通过hash函数转换为数组的下标
 *              final K key;//Map中的Key
 *              V value;
 *              Node<K,V> next;//下个节点的内存地址
 *          }
 *      }
 *  3.需要掌握：
 *      map.put(k,v)//存
 *          实现原理：
 *              1.将 k，v 封装到Node对象中
 *              2.底层调用k的hashcode（）得到hash值，通过hash函数或算法把hash值转换为数组的下标，下标没有任何元素就把Node加进去。
 *                  如果下标对应的位置有链表，此时拿着k和链表上的每个节点equals，如果所有的equals方法返回都是false，这个新结点将
 *                  被添加到链表的末尾（jdk8之前加到头节点）。如果其中一个equals返回了true，那么把链表上的那个节点的value改为当
 *                  前节点的value（这个节点的value将被覆盖）
 *
 *      v=map.get(k)//取
 *          实现原理：
 *              先调用k的hashcode（）得到hash值，通过hash函数或算法把hash值转换为数组的下标，通过数组下标快速定位到某个位置上，
 *                如果这个位置上什么也没有返回null。有单向链表，会拿着参数k和单向链表上的每个节点equals，如果所有equals方法返回
 *                false，get方法返回null，只有有一个节点的k和参数k equals时返回true，那么此时这个节点的value就是get的返回
 *
 *  4.增删在链表上完成，查询不需要扫描全部链表只需要部分扫描
 *
 *  5.key会调用hashcode（）和equals（），这两个方法需要重写
 *      equals默认比较的是两个对象的内存地址，应该比较内容
 *
 *  6.hashmap k部分的特点
 *      无序不可重复
 *          无序：
 *              不一定挂到那个单向链表上
 *          不可重复：
 *              底层的equals方法保证了
 *
 *  7.放在hashmap k部分的元素其实就是放在hashset中了，所以hashset中的元素也需要重写hashcode（）和equals（）
 *
 *  8.同一个单向链表上所有的hash相同（数组下标相同），但同一个链表上k和k的equals不同
 *
 *  9.hashmap使用不当时，无法发挥其性能
 *      当hash值都是一个值时，会出现一个单向链表
 *      称为：散列分布不均匀
 *      分布均匀：100个node，10个单向链表，每个单向链表10个值
 *      每个hash值都不同，底层就是一个一维数组，也是散列分布不均匀
 *
 * 【重点】：放在hashmap集合key部分的元素，以及放在hashset集合中的元素。需要同时重写hashcode和equals
 *
 *  10.hashmap的默认初始化容量是16个node，默认加载因子是0.75
 *      当hashmap底层数组的容量达到75%的时候，数组开始扩容
 *      hashhmap初始化容量必须是2的倍数（官方推荐）————————为了达到散列均匀，提高hashmap集合的存取效率
 *
 *  11.JDK8中的新特性：当hash表的单链表长度超过8时，会将单链表转换为红黑树的结构，当红黑树的节点数小于6时，会把红黑树重新变为单向链表
 *
 *
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        //测试hashmap k部分的元素的特点
        //Integer是key，hashcode和equals都重写了
        map.put(11111,"zhangsan");
        map.put(666,"lisi");
        map.put(777,"mingkai");
        map.put(767,"migkai");
        map.put(222,"king");
        map.put(222,"panda");//key重复 value自动覆盖
        System.out.println(map.size());//5

        //遍历
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        for(Map.Entry<Integer,String> s:set){
            /*
            hashmap k部分无序不可重复
             */
            System.out.println(s.getKey()+"------>"+s.getValue());
        }

    }
}
