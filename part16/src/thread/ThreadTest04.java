package thread;

/**
 * 1.怎么获取当前线程对象
 *      static Thread currentThread()
 *          Thread t=Thread.currentThread()
 *          t就是当前线程
 *
 *
 * 2.获取线程对象的名字
 *      t.getName()
 *
 * 3.修改线程对象的名字
 *      t.setName("ttt");
 *
 * 4.当线程没有设置名字的时候，默认的名字：
 *      Thread-0
 *      Thread-1
 *      Thread-2
 */
public class ThreadTest04 {
    public void doSome(){
        /*
        这样就不行了，this和super有局限性，能用只是恰好是个线程类
         */
        //this.getName();
        //super.getName();
        //这样一定行
        String name=Thread.currentThread().getName();
        System.out.println(name);

    }



    public static void main(String[] args) {

        //cur_thread就是当前线程对象
        //这个方法出现在main方法中，所有当前线程就是主线程
        Thread cur_thread=Thread.currentThread();
        System.out.println(cur_thread.getName());//主线程的名字就叫main


        //创建线程对象
        MyThread2 t1=new MyThread2();
        //设置线程的名字
        //默认线程的名字：Thread-0
        t1.setName("t1");
        //获取线程的名字
        String t_name= t1.getName();
        System.out.println(t_name);

        MyThread2 t2=new MyThread2();
        t2.setName("t2");
        System.out.println(t2.getName());//默认线程名字Thread-1
        //启动线程
        t1.start();
        t2.start();



    }
}

class MyThread2 extends Thread{

    @Override
    public void run() {
        /*
        当t1进程执行run方法，结果就是t1
        当t2.。。。。。。。。。。。。t2
         */
        Thread cur_thread=Thread.currentThread();
        for(int i=0;i<100;i++){
            System.out.println(cur_thread.getName()+"分支线程----->"+i);
        }
        System.out.println(this.getName()+"this和super一样可以获取线程的名字"+super.getName());//有局限性

    }
}