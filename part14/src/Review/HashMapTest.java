package Review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        //创建
        Map<Integer,String> map=new HashMap<>();
        //添加元素
        map.put(1,"assaa");
        map.put(2,"kjlkj");
        map.put(3,"lpoki");
        map.put(4,"poiop");
        map.put(5,"trqwe");
        map.put(5,"trasde");//可以重复value会覆盖
        //获取元素个数
        System.out.println(map.size());//5
        //取原数
        System.out.println(map.get(3));
        //遍历map集合
        //1.先获取所有的key，遍历key的时候获取value
        Set<Integer> keys=map.keySet();
        for(Integer key:keys){
            System.out.println(map.get(key));
        }
        //2.将map集合转换为set集合，set集合每个元素是node
        Set<Map.Entry<Integer,String>> nodes=map.entrySet();
        for(Map.Entry<Integer,String> node:nodes){
            System.out.println(node.getKey()+"----->"+node.getValue());
        }
    }
}
