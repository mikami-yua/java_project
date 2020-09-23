package thread;

/**
 * 关于线程的优先级
 *
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        System.out.println("最高优先级 ："+Thread.MAX_PRIORITY);
        System.out.println("最低优先级 ："+Thread.MIN_PRIORITY);
        System.out.println("默认优先级 ："+Thread.NORM_PRIORITY);

        //获取当前线程优先级
        Thread currentThread=Thread.currentThread();
        System.out.println(currentThread.getName()+"线程的优先级是： "+currentThread.getPriority());
        //main线程的优先级是： 5
        currentThread.setPriority(10);
        System.out.println(currentThread.getName()+"线程的优先级是： "+currentThread.getPriority());
        //main线程的优先级是： 10
    }
}
