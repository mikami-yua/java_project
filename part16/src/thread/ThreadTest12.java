package thread;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用wait和notify方法实现生产者和消费者模式
 *      生产线程负责生产，消费线程负责消费
 *      生产线程和消费线程要达到均衡
 *
 *  模拟：
 *      仓库采用list集合
 *      list集合只能存放一个元素
 *      1个元素就表示仓库满了，0表示空了
 *      需要做到：生产一个消费一个
 */
public class ThreadTest12 {
    public static void main(String[] args) {
        //创建1个仓库对象，共享的
        List list=new ArrayList();
        //创建两个线程
        Thread t1=new Thread(new Producer(list));
        Thread t2=new Thread(new Consumer(list));

        t1.setName("生产者线程： ");
        t2.setName("消费者线程： ");

        t1.start();
        t2.start();
    }
}

//生产线程
class Producer implements Runnable{
    //仓库
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        //一直生产(死循环模拟)
        while (true){
            //给仓库对象list加锁
            synchronized (list) {
                if (list.size() > 0) {
                    //当前线程等待，并释放list的锁。不释放对象的锁，消费线程不能对这个对象进行操作
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序执行到这里说明仓库是空的，可以生产
                Object obj=new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName()+"----->"+obj);

                //唤醒消费者，进行消费
                list.notify();
            }
        }
    }
}

//消费线程
class Consumer implements Runnable{
    //仓库
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        //一直消费
        while (true){
            //给仓库对象list加锁
            synchronized (list) {
                if (list.size() == 0) {//仓库空了
                    //当前线程等待，并释放list的锁。不释放对象的锁，消费线程不能对这个对象进行操作
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序执行至此说明，可以消费
                Object obj=list.remove(0);
                System.out.println(Thread.currentThread().getName()+"----->"+obj);
                //唤醒生产者生产
                list.notify();

            }
        }
    }
}
