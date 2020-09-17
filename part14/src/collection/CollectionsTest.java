package collection;



import java.util.*;

/**
 * java.util.Collection 集合接口
 * java.util.Collections 集合工具类
 */
public class CollectionsTest {
    public static void main(String[] args) {
        //ArrayList集合不是线程安全的
        List<String> list=new ArrayList<>();

        //变成线程安全的
        Collections.synchronizedList(list);

        //排序
        list.add("asd");
        list.add("sda");
        list.add("kkl");

        Collections.sort(list);
        for (String s:list){
            System.out.println(s);
        }

        List<Wugui2> wug=new ArrayList<>();
        wug.add(new Wugui2(1000));
        wug.add(new Wugui2(10));
        wug.add(new Wugui2(130));
        wug.add(new Wugui2(800));
        wug.add(new Wugui2(700));
        wug.add(new Wugui2(150));
        //[注意]对list集合中的元素排序，需要保证list集合中的元素实现了comparable接口
        Collections.sort(wug);
        for (Wugui2 w:wug){
            System.out.println(w);
        }

        //set集合的排序
        Set<String> set=new HashSet<>();
        set.add("asd");
        set.add("dff");
        set.add("hgf");
        set.add("we");
        set.add("bvc");
        //将set集合转为list集合
        List<String> mylist=new ArrayList<>(set);
        Collections.sort(mylist);
        for(String s:mylist){
            System.out.println(s);
        }
    }
}

class Wugui2 implements Comparable<Wugui2>{
    int age;

    public Wugui2(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "乌龟{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Wugui2 o) {
        return this.age-o.age;
    }
}