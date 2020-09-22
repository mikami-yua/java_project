package thread;

/**
 * 关于线程的sleep方法
 *      static void sleep(long millis)
 *      1.静态方法
 *          Thread.sleep(1000)
 *      2.参数是毫秒
 *      3.作用：让当前线程进入休眠状态，进入阻塞状态，放弃占有的cpu时间片，让给其他线程使用
 *          出现在哪里，那个线程就休眠
 *      4.Thread.sleep(1000)可以做到：间隔特定的时间去执行特定的代码
 *      5,sleep睡眠太久了，希望中途醒来。怎么唤醒一个正在睡眠的线程
 *          t3.interrupt();
 *          这种中断睡眠方式依靠了java的异常处理机制。调用这个放到sleep（）方法就会抛异常。try。。。catch语句块就进入了
 *          catch部分，抓住异常整个try。。。catch就结束了
 *          java.lang.InterruptedException: sleep interrupted
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        /*
        try {
            Thread.sleep(1000*5);//让当前线程休眠5s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hello");

         */
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"------>"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        /*
        面试题
         */
        Thread3 t=new Thread3();
        t.setName("t");
        t.start();

        try {
            /*
            sleep是静态方法和谁调用她没有关系
            在执行的时候还是会转换成
            Thread.sleep(1000)
            sleep出现在哪里，那个线程休眠
            出现在main中，main方法休眠
             */
            t.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*
        终止线程的睡眠
         */
        Thread t3=new Thread(new MyRunnable2());
        t3.setName("t3");
        t3.start();

        //希望5s之后t3线程醒来（5s之后主线程的工作完成）
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //中断t3线程的睡眠
        t3.interrupt();//干扰

    }
}

class Thread3 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"----->"+i);
        }
    }
}

class MyRunnable2 implements Runnable{

    //【重点】：run方法中的异常不能throws只能try。。。catch。因为run方法在父类中没有抛出任何异常
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-----> begin");
        //睡眠1年
        try {//只能try。。。catch（子类重写父类，不能比父类抛出更宽泛或者更多的异常）
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"-----> end");
    }
}