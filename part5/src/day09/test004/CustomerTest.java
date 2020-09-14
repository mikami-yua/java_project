package day09.test004;

public class CustomerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer c=new Customer();
		c.setId(100);
		c.setName("zhangsan");
		c.setAddr("beijing");
		c.setAge(50);
		
		
		System.out.println(c.getId());
		System.out.println(c.getAge());
		System.out.println(c.getName());
		System.out.println(c.getAddr());
		

	}

}
