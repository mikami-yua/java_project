package thread;

/**
 * 线程合并
 */
public class ThreadTest09 {
    public static void main(String[] args) {
        System.out.println("main begin");

        Thread t=new Thread(new MyRunnable6());
        t.setName("t");
        t.start();

        //合并线程
        try {
            t.join();//t合并到当前线程中，当前线程受阻塞，t线程执行知道结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //在内存上不是栈的合并而只是协调

        System.out.println("main over");
    }
}

class MyRunnable6 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"----->"+i);
        }
    }
}