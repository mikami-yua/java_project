/*
	方法重载

	-用于功能相似的方法

	-虽然调用的不同方法，但是就像使用一个方法一样
*/

public class OverloadTest01
{
	public static void main(String[] args){
		//此时方法不再依靠方法名区分，依靠调用类型区分
		System.out.println(sum(1,2));//参数的类型不同，调用的方法不同
		System.out.println(sum(1.0,2.0));
		System.out.println(sum(1L,2L));
		U.p("aaaaaaaaaaaa");
	}

	//定义方法计算两个int的和
	//定义方法计算两个double的和
	//定义方法计算两个float的和

	//以下三个方法构成了方法的重载
	public static int sum(int a,int b){
		return a+b;
	}
	public static double sum(double a,double b){
		return a+b;
	}
	public static long sum(long a,long b){
		return a+b;
	}
}