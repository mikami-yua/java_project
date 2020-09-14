/*
	抽象类
		-什么是
			类和类之间有共同特征，将这些特征提取出来，形成就是抽象类

			抽象类无法实例化

		-属于什么类型
			引用数据类型

		-怎么定义
			【修饰符列表】 abstract class 类名{
				类体
			}

		-抽象类无法实例化，所以是用来被子类继承的
			final abstract是对立的不能同时使用

		-抽象类的子类可以是抽象类

		-抽象类里有构造方法，构造方法供子类使用

		-抽象方法
			-表示没有实现的方法，没有方法体的方法
				public abstract void doSome();
				特点：没有方法体，以；结尾
					  修饰符列表有abstract
			
			-抽象类中不一定有抽象方法，类中抽象方法非抽象方法都可以有。但是抽象方法必须在抽象类中
		


*/
public class AbstactTest01
{
	public static void main(String[] args){
		//Account a = new Account();错误: Account是抽象的; 无法实例化
		
	}
}

abstract class Account
{

}

//子类继承
class CreditAccount extends Account
{

}