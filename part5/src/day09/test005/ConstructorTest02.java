package day09.test005;
/**
 * ���췽��������
 * 		1.��������
 * 		2.���������ͬʱ,��ʼ��ʵ���������ڴ�ռ�
 *
 */

public class ConstructorTest02 {

	public static void main(String[] args) {
		
		Account acc1=new Account();
		
		System.out.println("�˺ţ� "+acc1.getAccno());
		System.out.println("�� "+acc1.getBalance());
		
		Account acc2=new Account("110");
		
		System.out.println("�˺ţ� "+acc2.getAccno());
		System.out.println("�� "+acc2.getBalance());
		
		Account acc3=new Account(10000.0);
		
		System.out.println("�˺ţ� "+acc3.getAccno());
		System.out.println("�� "+acc3.getBalance());
		
		Account acc4=new Account("act-001",10000.0);
		
		System.out.println("�˺ţ� "+acc4.getAccno());
		System.out.println("�� "+acc4.getBalance());
		
	}

}
