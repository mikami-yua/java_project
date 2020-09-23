package threadsafe2;

/**
 * 银行账户
 * 使用线程同步机制解决安全问题
 *
 * 同步代码块越小效率越高
 */
public class Account {
    private String actName;
    private double balance;

    Object obj=new Object();//obj变量也是共享的，也可以写到（）中

    public Account() {
    }

    public Account(String actName, double balance) {
        this.actName = actName;
        this.balance = balance;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款方法
    public void withdraw(double money){
        //以下这几行代码必须是线程排队的，不能并发
        //一个线程把这里的代码全部执行结束之后，另一个线程才能进来

        /*
        线程同步机制
            synchronized (){
                //线程同步代码块
            }
        synchronized (这里面的传的东西是相当关键的)
        这个数据必须是多线程共享的数据才能达到多线程排队

        （）中写什么要看想让哪些线程同步
            假设t1，t2，t3，t4，t5.只希望t1，t2，t3排队，t4，t5不需要排队
            一定要在（）中写一个t1，t2，t3共享的对象，而这个对象对于t4，t5来说不是共享的

         这里的共享对象是：账户对象。this就是

         在java中，任何一个对象都有一把锁
         以下代码的执行原理：
            1.假设t1和t2线程并发，开始执行以下代码的时候肯定有一个先，有一个后
            2.假设t1先执行了，遇到了synchronized，这时候自动找后面共享对象的对象锁，找到之后占有这把锁。然后执行同步代码块中的程序，
                在执行的过程中一直都是占有这把锁的。直到同步代码块代码结束，这把锁才会释放。
            3.t1已经占有了这把锁，此时t2也遇到了synchronized，这时候自动找后面共享对象的对象锁。锁已被t1占有，t2只能在同步代码块外
                等待t1的结束。t1结束后，会归还这把锁，此时t2可以获得锁，t2占有锁之后，进入同步代码块执行。

         【注意】共享对象一定要选好
         */
        Object obj2=new Object();//这个不能当共享对象，执行函数就会new一个
        synchronized (this){
            double before=this.getBalance();
            //取款后的余额
            double after=before-money;
            //在这里模拟网络延迟100%出问题
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }
    }
}
