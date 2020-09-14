/*
	对象的创建和使用
*/
public class OOTest01
{
	public static void main(String[] args){
		
		int i=10;//i保存的是10
		//实例化一个对象的语法
		//new 类名（）;
		//new是Java的一个运算符，作用是在jvm堆内存中开辟新的内存空间
		//方法区内存：类加载时，class字节码代码片段被加载到该内存空间中
		//堆内存：new的对象
		//栈内存：方法代码执行时，给方法分配内存空间，在栈内存中压栈
		Student s=new Student();//Student是一个引用数据类型，s是一个变量名，new Student()是一个学生对象
		//s是一个局部变量，在栈内存中，s保存的是该对象在堆内存中的地址，s称之为引用【不是对象】
		//对象是new运算符在堆内存中开辟的内存空间称为对象
		//引用是一个变量，只不过这个变量中保存了另一个java对象在内存中的地址
		//java中不能直接操作堆内存，只能通过以用去访问堆内存中对象内部的实例变量
		//访问语法
		//读取：引用.变量名
		//修改：引用.变量名=值

		int stuNo=s.no;
		String stuName=s.name;
		int stuAge=s.age;
		boolean stuSex=s.sex;
		String stuAddress=s.address;

		System.out.println(stuNo);
		System.out.println(stuName);
		System.out.println(stuAge);
		System.out.println(stuSex);
		System.out.println(stuAddress);


		s.no=10;
		s.name="jack";
		s.age=20;
		s.sex=true;
		s.address="beijing";

		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sex);
		System.out.println(s.address);

		//再通过类实例化一个
		Student stu=new Student();
		
		//局部变量在栈内存中存储
		//成员变量中的实例变量在Java对象内部存储
		//实例对象是一个对象一份

	}
}