package thread;

/**
 * 采用匿名内部类
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        //使用匿名内部类的方式创建线程对象
        //通过一个没有名字的类new出来的对象
        //接口不能new对象，这里不是接口new的，只是这个对象没有名字
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.println("分支线程----->"+i);
                }
            }
        });
        //启动线程
        t.start();

        for(int i=0;i<100;i++){
            System.out.println("主线程----->"+i);
        }
    }
}
