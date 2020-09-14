package com.bj.javase.array;

/**
 * 数组中是引用数据类型
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        Animal a1=new Animal();
        Animal a2=new Animal();
        Animal a3=new Animal();
        Animal[] animals={a1,a2,a3};

        for(int i=0;i<animals.length;i++){
//            Animal a=animals[i];
//            a.move();
            //代码合并
            animals[i].move();
        }

        Animal[] ans=new Animal[2];
        ans[0]=new Animal();
        //cat是animal的子类
        ans[1]=new Cat();

        Animal[] ans1={new Cat(),new Brid()};
        for(int i=0;i<ans1.length;i++){
            Animal aaa=ans1[i];
            aaa.move();

            //调用子对象中特有方法需要向下转型
            if (ans1[i] instanceof Cat){
                Cat cat = (Cat)ans1[i];
                cat.catchMouse();
            }else if(ans1[i] instanceof Brid){
                Brid brid=(Brid)ans1[i];
                brid.sing();
            }
        }
    }
}

class Animal{
    public void move(){
        System.out.println("Animal move...");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("cat move...");
    }
    //特有方法
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}

class Brid extends Animal{
    public void move(){
        System.out.println("brid flying...");
    }

    public void sing(){
        System.out.println("brid is singing");
    }
}