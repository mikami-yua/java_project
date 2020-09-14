package day11;
/**
 * 方法的覆盖
 * 		-方法的重载
 * 			称为overload
 * 			当在同一个类中，方法完成的功能相似，建议方法名相同，方便编程
 * 			同一个类中，方法名相同，形参列表不同
 * 			和返回值类型无关，和修饰词列表无关
 * 		
 * 		-方法的覆盖
 * 			又被称为：方法重写-----override
 * 			
 *			什么时候使用
 *				父类中的方法无法满足子类的业务需求，子类重新编写父类的方法
 *
 *			什么条件满足后会发生
 *				发生在具有继承关系的父子类之间
 *				方法名相同，返回值类型相同，形参列表相同
 *				访问权限不能更低
 *				抛出异常不能更多
 *			
 *			建议方法重写时之间复制粘贴
 *
 *			私有方法不能继承不能覆盖
 *			构造方法不能继承不能覆盖
 *			静态方法不存在覆盖
 *				
 *
 */
public class OverrideTest01 {


	public static void main(String[] args) {
		Animal a = new Animal();
		a.move();
		
		Cat c=new Cat();
		c.move();
		
		Brid b=new Brid();
		b.move();
		
		YingWu y=new YingWu();
		y.move();
		

	}

}
