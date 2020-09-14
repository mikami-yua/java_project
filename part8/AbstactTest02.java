/*
	抽象类
		
		-一个非抽象的类继承了抽象类，必须实现抽象方法【必须记住】

		-并非凡是没有方法体的都是抽象方法
			Object类中 public native int hashCode();
			底层调用c++写的动态链接库
*/
public class AbstactTest02
{
	public static void main(String[] args){
		//使用多态
		//父类型指向字类型
		Animal a = new Bird();//面向抽象编程
		//编译时move方法是animal的
		//运行时move方法是bird的
		a.move();

		//多态
	}
}

abstract class Animal
{
	//抽象方法
	public abstract void move();
}

class Bird extends Animal
{
	//需要重写抽象方法
	public void move(){
		System.out.println("鸟在飞");
	}
}