package Review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        //LinkList同ArrayList,只是创建不同
        LinkedList<String> list2=new LinkedList<>();//下面相同



        list.add("lisis");
        //取元素，list有下标
        String first=list.get(0);
        //遍历,下标
        for(int i=0;i<list.size();i++){
            String str=list.get(i);
        }
        //迭代器遍历(同用的所有Collection都能用)
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //遍历foreach
        for(String s:list){
            System.out.println(s);
        }



    }
}
