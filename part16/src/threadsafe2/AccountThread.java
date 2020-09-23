package threadsafe2;

public class AccountThread extends Thread{
    //两个线程必须共享同一个账户对象
    private Account act;

    //通过构造方法传递账户对象
    public AccountThread(Account act){
        this.act=act;
    }

    @Override
    public void run() {
        //run方法的执行表示取款操作
        //取款5k
        double money=5000;
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName()+"对"+act.getActName()+"取款成功,余额 ："+act.getBalance());
    }
}
