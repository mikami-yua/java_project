package day09.test005;
/**
 * 构造方法的作用
 * 		1.创建对象
 * 		2.创建对象的同时,初始化实例变量的内存空间
 *
 */

public class ConstructorTest02 {

	public static void main(String[] args) {
		
		Account acc1=new Account();
		
		System.out.println("账号： "+acc1.getAccno());
		System.out.println("余额： "+acc1.getBalance());
		
		Account acc2=new Account("110");
		
		System.out.println("账号： "+acc2.getAccno());
		System.out.println("余额： "+acc2.getBalance());
		
		Account acc3=new Account(10000.0);
		
		System.out.println("账号： "+acc3.getAccno());
		System.out.println("余额： "+acc3.getBalance());
		
		Account acc4=new Account("act-001",10000.0);
		
		System.out.println("账号： "+acc4.getAccno());
		System.out.println("余额： "+acc4.getBalance());
		
	}

}
