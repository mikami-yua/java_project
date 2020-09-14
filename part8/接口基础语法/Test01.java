/*
	接口
		-是一种引用数据类型
		-接口是完全抽象的（抽象类是半抽象的），接口是特殊的抽象类
		-语法
			【修饰符列表】 interface 接口名{
			}
		-接口编译之后也是class字节码文件

		-接口支持多继承，一个接口可以继承多个接口

		-接口中只有
			-常量
			-抽象方法
			没有其他内容
		-接口中所有元素都是public
		-接口中的抽象方法定义时public abstract可以省略
		-接口中的方法不能有方法体
		-接口中的常量的public static final可以省略

*/
public class Test01
{
	public static void main(String[] args){
		//访问接口常量
		System.out.println(MyMath.PI);
		
	}
}
//定义接口
interface A
{
}
interface B
{
}
interface C extends A,B
{
}
interface MyMath
{	
	//常量
	public static final double PI = 3.1415926;
	//常量的public static final可以省略
	double p=3.14;

	//抽象方法
	public abstract int sum(int a,int b);

	//接口中都是抽象方法，public abstract可以省略
	int div(int a,int b);

	int sub(int a,int b);
}