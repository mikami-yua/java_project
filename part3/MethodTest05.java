/*
	方法调用
	
	-有static关键字的可以省略类名不写
	
	-负责调用的程序和被调用程序在一个类中，类名可以省略
	

	【实际开发中一个Java文件写一个class】
*/
public class MethodTest05{
	public static void main(String[] args){
		MethodTest05.m();

		m();//有static可以省略不写

		//调用其他类不是本类中的方法
		A.doOther();
		//省略类名
		//doOther();错误: 找不到符号

		//不想调用本类中的m2，需要添加类名
		A.m2();
	}
	public static void m(){
		System.out.println("mmmmmmmm");
		m2();//可以调用
	}

	public static void m2(){
		System.out.println("2222222222222");
	}
}

class A
{
	public static void doOther(){
		System.out.println("class A");
	}

	public static void m2(){
		System.out.println("AAAAAAAAAAAAAAAA2222222222222");
	}
}

//p87-14.27