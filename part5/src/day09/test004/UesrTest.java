package day09.test004;

public class UesrTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user=new User();
		
		//user.age;报错age不能访问
		//age外部彻底访问不到了
		//修改
		user.setAge(-100);
		//读取
		System.out.println(user.getAge());
		
	}

}
