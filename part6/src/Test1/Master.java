package Test1;
/**
 * 主人类
 */
/*//没有使用多态机制，缺点Masteer的扩展性很差，只要增加一个新的宠物，master就需要改
public class Master {
	//喂养
	public void feed(Cat c){
		c.eat();
	}
	public void feed(Dog d){
		d.eat();
	}
}master和dog cat耦合度很高
*/
//降低程序的耦合度【解耦合】，提高程序的扩展力【开发的目标】
public class Master {
	//喂养
	public void feed(Pet p){//Pet p是一个父类型的引用
		p.eat();
	}
}
