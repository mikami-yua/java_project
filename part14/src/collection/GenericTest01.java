package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 泛型
 *  JDK5.0之后的新机制
 *  泛型在编译阶段起作用，运行阶段意义不大
 *  好处：
 *      1.集合中元素类型统一了
 *      2.从集合中取出的元素是泛型指定的类型，不需要大量的向下转型
 *  缺点：
 *      集合中存储的元素缺乏多样性
 *
 *  大多数业务中，集合中类型是统一的
 */
public class GenericTest01 {
    public static void main(String[] args) {

        //分析不适用泛型机制的缺点
        List mylist1=new ArrayList();

        //准备对象
        Cat c=new Cat();
        Bird b=new Bird();

        //将对象添加到集合中
        mylist1.add(c);
        mylist1.add(b);

        //遍历集合，让动物move
        Iterator it=mylist1.iterator();
        while(it.hasNext()){
            Object obj=it.next();
            //Animal a=it.next();报错，通过迭代器取出的就是Object
            //Obj中没有move方法，需要向下转型
            if(obj instanceof Animal){
                Animal a=(Animal)obj;
                a.move();

            }
        }
        System.out.println("*******************泛型***********************************");
        /*
        下面使用泛型
        使用泛型List<Animal>之后表示，list集合中只允许存放animal类的数据
        用泛型来指定集合中的存储类型
         */
        List<Animal> mylist2=new ArrayList<Animal>();
        //mylist2.add("abc");Required type: Animal
        //不能再存放string类型了
        //这样集合中的数据类型就统一了
        Cat c1=new Cat();
        Bird b2=new Bird();

        mylist2.add(c1);
        mylist2.add(b2);

        //获取迭代器
        //表示迭代器迭代的是Animal类型
        Iterator<Animal> it2=mylist2.iterator();
        while (it2.hasNext()){
            //使用泛型之后每次迭代的数据都是animal类型
            Animal a=it2.next();
            //不需要强制类型转换了
            a.move();
            //调用子类型的特有方法，即使有泛型也要向下转型
            if(a instanceof Cat){
                Cat x=(Cat)a;
                x.catchMouse();
            }
            if(a instanceof Bird){
                Bird y=(Bird)a;
                y.fly();
            }
        }
    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }

}

class Bird extends Animal{
    public void fly(){
        System.out.println("小鸟在飞");
    }

}