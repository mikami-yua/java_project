/*
	方法的调用不一定在main中
	程序可以执行到的都可以调用

*/


public class  MethodTest03
{	
	public static void sum(int a,int b){
		System.out.println(a+b);
		//调用doSome方法
		MethodTest03.doSome();
	}

	public static void main(String[] args){
		//调用sum方法
		MethodTest03.sum(1,2);
		System.out.println("helloworld!");
	}

	public static void doSome(){
		System.out.println("do some!");
	}
}