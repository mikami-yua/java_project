/*
	代码的复用
	-invoke 调用
	-某个功能代码只需要写一遍
	-方法的本质就是一段独立的代码片段，且可以完成某个特定的功能

	-方法定义在类体中
	-方法编写的顺序没有先后顺序
	-方法体中不能再定义方法
	-方法体中的代码遵守自上而下的顺序执行
*/
public class MethodTest01
{
	public static void main(String[] args){
		//需求1
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);

		//需求2
		int m=66;
		int n=88;
		int k=m+n;
		System.out.println(m+"+"+n+"="+k);
		//以上两个需求其实是一个需求

		MethodTest01.sumInt(a,b);
	}

	//单独定义一个方法，该方法完成求和功能
	public static void sumInt(int a,int b){
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}
}