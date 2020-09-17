package map;

import java.util.TreeSet;

/**
 * 自定义类型------不能排序
 *      因为灭有指定person对象之间的比较规则。
 *      还会出现这个异常
 *      java.lang.ClassCastException: class map.Person cannot be cast to class java.lang.Comparable
 *      person未实现java.lang.Comparable接口
 *
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        /*
        Person p1=new Person(32);
        Person p2 =new Person(4);
        Person p3 =new Person(234);
        Person p4 =new Person(23);
        Person p5 =new Person(12);
        Person p6 =new Person(78);

        TreeSet<Person> ts=new TreeSet<>();
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        ts.add(p5);
        ts.add(p6);

        for(Person p:ts){
            System.out.println(p);
        }

         */
        Customer p1=new Customer(32);
        Customer p2 =new Customer(4);
        Customer p3 =new Customer(24);
        Customer p4 =new Customer(23);
        Customer p5 =new Customer(12);
        Customer p6 =new Customer(78);

        TreeSet<Customer> c=new TreeSet<>();
        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
        c.add(p5);
        c.add(p6);

        for(Customer p:c){
            System.out.println(p);
        }
    }
}

class Person{
    int age;

    public Person(int age) {
        this.age = age;
    }
    //重写tostring方法

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

/**
 * 放在TreeSet集合中的元素需要实现java.lang.Comparable接口
 * 并且实现compareTo方法，equals可以不写
 */
class Customer implements Comparable<Customer>{
    int age;

    public Customer() {
    }

    public Customer(int age) {
        this.age = age;
    }

    /**
     * 在这个方法中编写比较的逻辑或比较的规则。
     * 比较规则还是由开发者指定的，按照年龄升序，按照年龄降序
     * 升序：this.age-c.age;
     * Customer{age=4}
     * Customer{age=12}
     * Customer{age=23}
     * Customer{age=24}
     * Customer{age=32}
     * Customer{age=78}
     * 降序：c.age-this.age;
     * @param c 拿着参数o和集合中每个元素进行比较
     * @return  可能是>0 <0 =0
     */
    @Override
    public int compareTo(Customer c) { //c1.compareTo(c2)
        //this是c1
        //c是c2
        //c1和c2比较就是this和c比较
        int age1=this.age;
        int age2=c.age;
//        if(age1==age2) return 0;
//        else if(age1>age2) return 1;
//        else return -1;
        return this.age-c.age;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                '}';
    }
}
