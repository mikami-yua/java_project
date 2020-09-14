package day09.test005;
//块编辑支持多行编辑
public class ConstructorTest03 {
	public static void main(String[] args) {
		Customer c1=new Customer();
		System.out.println(c1.getNo());
		System.out.println(c1.getName());
		System.out.println(c1.getBirth());
		
		Customer c2=new Customer(111,"zahngsab","2020-8-8");
		System.out.println(c2.getNo());
		System.out.println(c2.getName());
		System.out.println(c2.getBirth());
		
	}

}
