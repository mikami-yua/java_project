package map;

import java.util.HashMap;
import java.util.Map;

/**
 * hashmap key部分可以null吗？ 允许
 *      但是null值只能有一个
 */
public class HashMapTest03 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put(null,null);
        map.put(null,100);
        System.out.println(map.size());//1
    }
}
