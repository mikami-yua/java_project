package threadsafe3;

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
    /*
    在实例方法上使用synchronized,锁的是this，不灵活
    且整个方法体都需要同步，可能会无故扩大同步范围，这种方式不常用

    如果共享的对象就是this，且整个方法都需要同步，这个方法整洁
     */
    public synchronized void withdraw(double money){
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

        this.setBalance(after);
    }
}
