package thread;

/**
 * 强行终止一个线程的执行
 *
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        MyRunnable3 r=new MyRunnable3();
        Thread t=new Thread(r);
        t.setName("t");
        t.start();

        //模拟5s
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5s之后强行终止t线程
        //t.stop();//已过时不建议使用
        /*
        stop()方法的缺点：
            容易丢失数据，直接将线程杀死，线程没有保存的数据就消失了

        t----->0
        t----->1
        t----->2
        t----->3
        t----->4

        Process finished with exit code 0
         */
        //终止线程
        //想什么时候终止线程的执行，把标记改为false就结束
        r.run=false;

    }
}

class MyRunnable3 implements Runnable{

    //打布尔标记
    boolean run=true;

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            if(run) {
                System.out.println(Thread.currentThread().getName() + "----->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //return就结束了，还有什么没有保存的在这里可以保存

                //结束当前线程
                return;
            }
        }
    }
}
