package map;

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
 */
public class MapTest01 {
}
