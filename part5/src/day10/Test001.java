package day10;

public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		c1.name="zhangsan";
		c1.shopping();
		Customer c2=new Customer();
		c2.name="lisi";
		c2.shopping();
		
		//����doSome���������δ��б���static
		//��������.��ʽ
		//ִ��ʱ����Ҫ����Ĳμ�
		Customer.doSome();
		
	}

}
