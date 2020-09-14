package com.javase.date;

public class DateTest02 {
    public static void main(String[] args) {
        long nowtime=System.currentTimeMillis();//获取1970-01-01至今的总毫秒数
        System.out.println(nowtime);//1592358579723

        long begin = System.currentTimeMillis();
        print();
        long end= System.currentTimeMillis();
        System.out.println("耗费时长 ： "+ (end-begin)+"毫秒");//耗费时长 ： 17毫秒
    }

    //统计一个方法耗费的时长
    public static void print(){
        for (int i=0;i<1000;i++){
            System.out.println("i = "+i);
        }
    }
}
