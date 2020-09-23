package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;//juc包下，java的并发包，老jdk没有这个

/**
 * 实现线程的第三种方式：
 *      实现callable接口
 *      优点：可以获取线程的执行结果
 *      缺点：效率低，当前线程会受阻塞
 */
public class ThreadTest11 {
    public static void main(String[] args) throws Exception{
        //1.创建一个未来任务类对象
        //【注意】参数非常重要，需要给一个callable接口的实现类对象
        FutureTask task=new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//call方法就相当于run方法，只不过这个有返回值
                //线程可能有一个执行任务
                System.out.println("call method begin");
                Thread.sleep(1000*10);
                int a=100,b=200;
                System.out.println("call method end");
                return a+b;//自动装箱为Integer
            }
        });

        //创建线程对象
        Thread t=new Thread(task);

        //启动线程
        t.start();

        //在主线程中获取t线程的执行结果
        //get方法会导致当前方法阻塞
        Object obj=task.get();
        System.out.println("线程执行结果"+obj);
        //main方法这里的程序要想执行，必须等待get方法的结束。必须等另一个线程执行结束
        System.out.println("hello");
    }
}
