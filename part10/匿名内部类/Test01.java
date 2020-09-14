/*
	匿名内部类
		-内部类
			类的内部又定义了一个类

		-内部类分类
			静态内部类：类似静态变量
			实例内部类：类似实例变量
			局部内部类：类似局部变量

		-使用内部类写的代码可读性差

		-匿名内部类是局部内部类的一种
			匿名内部类没有名字

		-不建议使用匿名内部类
*/

public class Test01
{
	static class Inner1//静态内部类
	{
	}

	class Inner2//没有static，实例内部类
	{
	}

	public void doSome(){
		
		class Inner3//局部内部类
		{
		}
	}

	public static void main(String[] args){
		MyMath mm=new MyMath();
		//这样写有类名------类名是ComputeImpl()
		mm.mySum(new ComputeImpl(),100,200);

		//匿名内部类------之间new接口
		MyMath mm1=new MyMath();
		mm1.mySum(new Compute(){
			public int sum(int a,int b){
				return a+b;
			}
		},200,300);
	}
}

interface Compute
{
	int sum(int a, int b);
}

class ComputeImpl implements Compute
{
	public int sum(int a,int b){
		return a+b;
	}
}

class MyMath
{
	public void mySum(Compute c,int x,int y){
		int retValue=c.sum(x,y);
		System.out.println(retValue);
	}
}