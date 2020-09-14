/*
	在JVM中内存的变化
		-方法只定义不调用，不会执行，且在jvm中也不会分配运行的内存空间,调用时才会动态划分内存空间

		-jvm内存划分上有这样三种主要的内存空间
			-方法区
			-堆区
			-栈区
		
		-关于栈
			-stack

		-方法执行的时候，代码片段在哪里，执行过程内存在哪里分配
			-代码片段属于.class字节码文件的一部分，字节码文件在类加载的时候，将其放到了方法区中，所以JVM中三个主要的内存空间
			 中方法区最先有数据，存放了代码片段。
			-代码片段虽然在方法区中只有一份，但是可以被重复调用，每次调用这个方法的时候，需要给该方法分配独立的活动场所，在
			 栈内存中分配。【栈内存中分配方法运行的所属内存空间】
			-方法在调用时，给该方法分配独立的内存空间，在栈中分配，此时发生压栈动作，方法执行结束后，给该方法分配的内存空间
			 全部释放，此时发生弹栈动作。
			-局部变量在栈中存储，在方法体中声明
			-方法调用时，参数传递传的是变量中的值，不是传的内存空间

		
			

*/
public class MethodTest08
{
	public static void main(String[] args){
		
		int a=10,b=20;
		int retValue=sumInt(a,b);
		System.out.println("retValue==="+retValue);
	}

	public static int sumInt(int i,int j){
		int result=i+j;
		int num=3;
		int retValue=divide(result,num);
		return retValue;
	}

	public static int divide(int x,int y){
		int z=x/y;
		return z;
	}
}


