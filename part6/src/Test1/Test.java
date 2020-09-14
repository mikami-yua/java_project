package Test1;
/**
 * 多态在实际开发中的作用，以下以主人喂宠物为例
 * 	-分析：类型的抽象
 * 		-主人【类】
 * 			-喂养【动作】
 * 		-宠物【类】
 * 			-吃东西【动作】
 * 
 * 定义好类，然后将类实例化为对象，给一个环境驱使，让各个对象协作起来形成系统
 * 
 * 多态的作用是
 * 	降低程序的耦合度，提高扩展力
 * 	父类型引用指向子类型对象
 */
public class Test {

	public static void main(String[] args) {
		
		//创建主人
		Master zhangsan = new Master();
		//创建猫
		//Cat tom = new Cat();
		zhangsan.feed(new Cat());
		
		
		//Dog erha = new Dog();
		zhangsan.feed(new Dog());
		
		Snack python = new Snack();
		zhangsan.feed(python);

	}

}
