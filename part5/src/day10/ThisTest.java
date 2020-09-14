package day10;
//p139= 0.30
/**
 * 在带有static关键字的方法中不能直接访问实例变量和实例方法
 * 因为实例变量实例方法都需要对象的存在
 * static中没有this
 */
public class ThisTest {

	public static void main(String[] args) {
		ThisTest.doSome();
		doSome();
		
		//doOther();报错，实例方法一定是引用.
		//this.doOther();报错，main方法没有this
		ThisTest tt= new ThisTest();
		tt.doOther();
		

	}
	
	//带有static
	public static void doSome(){
		System.out.println("dosome");
	}
	//实例方法
	public void doOther(){
		//this表示当前对象
		System.out.println("doother");
	}
	public void run(){
		//调用run方法一定是有对象存在的
		//在{}中一定是存在当前对象的，是有this的
		System.out.println("run");
		
		//调用当前对象的doOther
		doOther();
	}
	

}
