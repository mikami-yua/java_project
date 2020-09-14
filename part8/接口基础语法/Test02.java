/*
	类和类之间是继承，类和接口之间是实现
		继承使用extends
		实现使用implements
	
	【*****】当一个非抽象的类实现接口需要把接口中所有抽象方法都实现



*/
public class Test02
{
	public static void main(String[] args){
		//多态 父类型的引用指向字类型的变量
		MyMath mm=new MyMathImpl();
		
		//调用接口里的方法（面向接口编程）
		int result1=mm.sum(10,20);
		System.out.println(result1);
		int result2=mm.sub(10,20);
		System.out.println(result2);
	}
}

//特殊的抽象类，完全抽象类====接口
interface MyMath
{	
	double PI=3.1415926;

	int sum(int a,int b);
	int sub(int a,int b);
}
//类，非抽象类，需要实现抽象方法
class MyMathImpl implements MyMath
{
	public int sum(int a,int b){
		return a+b;
	}
	public int sub(int a,int b){
		return a-b;
	}
}