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
		
		//调用doSome方法，修饰词列表有static
		//采用类名.方式
		//执行时不需要对象的参加
		Customer.doSome();
		
	}

}
