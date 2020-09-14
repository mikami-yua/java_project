package day10;
/**
 * 带有static的方法既可以采用类名的方式访问，也可以采用引用的方式访问
 * 即使采用引用的方式访问，实际执行的时候和指引的对象也无关
 * 
 *
 */
public class Test {
	int i=10;
	public static void method1(){
		//调用do some
		//完整方式调用，省略方式调用
		Test.doSome();
		doSome();
		
		//调用do other
		//完整方式调用，省略方式调用--------没有省略的方法
		Test tt= new Test();
		tt.doOther();
		
		//访问i
		//完整方式
		System.out.println(tt.i);
		//省略方式无
	}
	public void method2(){
		//调用do some
		//完整方式调用，省略方式调用
		Test.doSome();
		doSome();
		//调用do other
		//完整方式调用，省略方式调用
		this.doOther();
		doOther();
		//访问i
		//完整方式
		System.out.println(this.i);
		//省略方式
		System.out.println(i);
		
	}
	public static void main(String[] args) {
		//调用method1-----带static
		//完整方式调用
		Test.method1();
		//省略方式调用
		method1();
		
		
		//调用method2-----不带static
		//完整方式调用
		Test tt= new Test();
		tt.method2();
		//省略方式调用
		//method2();报错，不带static不能使用省略方法

	}
	
	
	public static void doSome(){
		System.out.println("do some");
	}
	public void doOther(){
		System.out.println("do other");
	}

}
