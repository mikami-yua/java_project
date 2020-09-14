package day09.test005;
//类中元素过多
//CTRL+o可以概览，也可以输入元素名称查找
public class Account {
	private String accno;//实例变量，对象变量，没有对象就不初始化
	private double balance;
	
	public Account(){
		
	}
	
	public Account(String s){
		accno=s;
	}
	public Account(double s){
		balance=s;
	}
	public Account(String s,double d){
		accno=s;
		balance=d;
	}
	
	
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
