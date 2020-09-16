package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * JDK8之后引入了自动类型推断机制（又称为钻石表达式）
 *
 *
 */
public class GenericTest02 {
    public static void main(String[] args) {
        //ArrayList<这里的类型会自动推断>（）
        //长得像钻石
        List<Animal> mylist=new ArrayList<>();

        mylist.add(new Animal());
        mylist.add(new Cat());
        mylist.add(new Bird());

        //遍历
        Iterator<Animal> it=mylist.iterator();
        while(it.hasNext()){
            Animal a= it.next();
            a.move();
        }

        List<String> strlist=new ArrayList<>();
        //报错：类型不匹配
        //strlist.add(new Cat());
        strlist.add("123");
        strlist.add("abc");

        Iterator<String> it2=strlist.iterator();
        while (it2.hasNext()){
            String s=it2.next();
            //不使用泛型不能用substring方法
            String new_s=s.substring(1);//substring也是从0计数
            System.out.println(new_s);
        }
    }
}
