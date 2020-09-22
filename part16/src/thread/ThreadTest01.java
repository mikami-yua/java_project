package thread;

/**
 * 实现线程的方法1：编写一个类直接继承java.lang.Thread重写run方法
 *
 * 创建线程对象--------new
 * 启动线程--------调用线程对象的start方法
 *
 *
 * 以下程序的输出有这些特点：
 *      有先有后
 *      有多有少
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        /*
        这里的代码属于主线程，在主栈中运行
         */
        System.out.println("main begin");

        //新建一个分支线程对象
        MyTread myTread=new MyTread();

        //启动线程
        myTread.start();
        /*
        start方法的作用是：启动一个分支线程在jvm中开辟一个新的栈空间。
        这段代码任务完成之后，瞬间就结束了
        这段代码的任务只是为了开辟一个新的栈空间，只要栈空间开辟出来，start（）方法就结束了，线程就启动成功了
        启动成功的线程会自动调用run（）方法。并且run（）方法在分支栈的底部（压栈）
        run（）方法在分支栈的栈底部，main方法在主栈的栈底部。run和main是平级的
         */
        //myTread.run();//不会启动线程，不会分配新的分支栈



        //这里的代码还是运行在主线程中
        for(int i=0;i<1000;i++){
            System.out.println("主线程----->"+i);
        }

        System.out.println("main over");
    }

}

class MyTread extends Thread{
    /**
     * 不需要手动调度，由jvm线程调度机制来运作
     */
    @Override
    public void run() {
        /*
        在这里编写程序，这段代码运行在分支线程中
         */
        for(int i=0;i<1000;i++){
            System.out.println("分支线程----->"+i);
        }
    }
}