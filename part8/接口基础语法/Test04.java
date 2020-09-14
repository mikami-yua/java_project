/*
	继承和实现同时存在
		extends在前implements在后
*/
public class Test04
{
	public static void main(String[] args){
		Flyable f =new Cat();//多态
		f.fly();
	}
}

class Animal
{
}
//能插拔的就是接口
//接口通常提前动作
interface Flyable
{
	void fly();
}

class Cat extends Animal implements Flyable
{
	public void fly(){
		System.out.println("cat is flying");
	}
}