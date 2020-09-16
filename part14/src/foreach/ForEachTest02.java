package foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集合使用foreach
 */
public class ForEachTest02 {
    public static void main(String[] args) {
        //创建list集合
        List<String> strlist=new ArrayList<>();
        //添加元素
        strlist.add("hello");
        strlist.add("world");
        strlist.add("kitty");
        //使用迭代器方式
        Iterator<String> it=strlist.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }

        //使用下标方式（只针对有下标的集合）
        for (int i=0;i<strlist.size();i++){
            System.out.println(strlist.get(i));
        }

        //使用foreach
        for(String s:strlist){//泛型使用的是string类似，所以是string
            System.out.println(s);
        }

    }
}
