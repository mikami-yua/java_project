package threadsafe;

/**
 * 银行账户
 * 不使用线程同步机制，多个线程同时取款出现安全问题
 */
public class Account {
    private String actName;
    private double balance;

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
        /*
        t1 & t2 并发执行这个方法（t1，t2两个栈操作堆中同一个对象）
         */


        //取款前的余额
        double before=this.getBalance();
        //取款后的余额
        double after=before-money;

        //在这里模拟网络延迟100%出问题
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //更新余额
        /*
        t1执行到这里，但还没来得及执行这行代码，此时t2线程进入withdraw方法。
        此时一定出问题

        也可能不出问题。t1执行完整个方法，t2再进来就不会出问题
         */
        this.setBalance(after);
    }
}
