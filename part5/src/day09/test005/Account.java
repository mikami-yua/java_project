package day09.test005;
//����Ԫ�ع���
//CTRL+o���Ը�����Ҳ��������Ԫ�����Ʋ���
public class Account {
	private String accno;//ʵ�����������������û�ж���Ͳ���ʼ��
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
