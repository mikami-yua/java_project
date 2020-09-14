package day09.test001;

/*
 * 
 * *
 * 学生测试类
 */
public class StudentTest {
	
	//main方法自动补全，输入main alt+/自动补全
	public static void main(String[] args) {
		//创建学生对象
		Student s=new Student();
		//访问对象属性
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.addr);
		System.out.println(s.sex);
		System.out.println(s.age);
		
		s.no=10;
		s.name="zhangsan";
		System.out.println(s.no);
		System.out.println(s.name);
		
	}

}
