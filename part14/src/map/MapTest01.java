package map;

import java.util.*;

/**
 * java.util.map接口中常用的方法
 *  1.map和collection没有继承关系
 *  2.map集合以key和value的方式存储数据
 *      key和value都是引用数据类型
 *      key和value都存放对象的内存地址
 *      value是key的附属品
 *  3.map接口中常用方法
 *      void clear（）
 *      boolean containsKey（Object key）
 *      boolean containsValue（Object value）
 *      V get(Object Key)//通过key获取value
 *      boolean isEmpty()
 *      V put(K key,V value)//放键值对
 *      V remove(K key)//删除键值对
 *      int size（）
 *      Collection<V> values()//获取所有value，返回一个collection
 *      Set<E> keySet()//获取map中所有的key
 *      Set<Map.Entry<K,V>> entrySet()//将map集合转换为set集合。set集合中用等号链接原来的键值对作为一个元素
 *                                      //set集合中的元素类型是Map.Entry<K,V>
 *
 *  4.所有的key是个set集合
 *
 *  5.contains方法底层调用的都是equals，自定义类型需要重写equals
 */
public class MapTest01 {
    public static void main(String[] args) {
        //创建map集合对象
        Map<Integer,String> map=new HashMap<>();

        //测试
        //1.V put(K key,V value)//放键值对
        map.put(1,"zhangsan");//1进行了自动装箱
        map.put(2,"asd");
        map.put(3,"sda");
        map.put(4,"jkoks");
        map.put(5,"sdaas");

        //2.V get(Object Key)//通过key获取value
        String str=map.get(3);
        System.out.println(str);

        //3.int size（） 获取键值对的数量
        System.out.println(map.size());

        //4.V remove(K key)//删除键值对
        map.remove(2);
        System.out.println(map.size());

        //5.boolean containsKey（Object key）判断是否包含某个key
        System.out.println(map.containsKey(3));

        //6.boolean containsValue（Object value）判断是否包含某个value
        System.out.println(map.containsValue("zhangsan"));

        //7.Collection<V> values()//获取所有value，返回一个collection
        Collection<String> values=map.values();
        for(String s:values){
            System.out.println(s);
        }

        //8.boolean isEmpty()判断集合是否为空、
        System.out.println(map.isEmpty());

        /*
        9.map集合的遍历
        [非常重要]
         */
        //1.获取所有的key，通过遍历key来遍历value
            //获取所有的key是个set集合
        Set<Integer> keys=map.keySet();
            //遍历key，通过key得到value
            //【迭代器】
        Iterator<Integer> it=keys.iterator();
        while(it.hasNext()){
            Integer key=it.next();
            System.out.println(key+"-->"+map.get(key));
        }
            //【foreach】
        for(Integer key:keys){
            System.out.println(key+"-->"+map.get(key));
        }
        //【下面的效率高】获取key和value都是从node中获取的属性值
        //2.Set<Map.Entry<K,V>> entrySet()//将map集合转换为set集合。set集合中用等号链接原来的键值对作为一个元素
            //把map集合直接全部转换为set集合，集合类型是Map.Entry
        Set<Map.Entry<Integer,String>> set=map.entrySet();
            //遍历set集合每次取出一个node
            //【迭代器】
        Iterator<Map.Entry<Integer,String>> it2=set.iterator();
        while (it2.hasNext()){
            Map.Entry<Integer,String> node=it2.next();
            Integer key=node.getKey();
            String value=node.getValue();
            System.out.println(key+"-->"+value);

        }
            //【foreach】
        for(Map.Entry<Integer,String> node:set){
            System.out.println(node.getKey()+"="+node.getValue());
        }



        //10.void clear（）清空集合
        map.clear();
        System.out.println(map.size());
    }

}
