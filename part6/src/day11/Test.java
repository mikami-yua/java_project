package day11;
/**
 * 多态
 * 		-animal cat brid
 * 			cat和brid之间没有继承关系
 * 		
 * 		-关于多态中的几个概念
 * 			向上转型：upcasting  
 * 				子类型转换为父类型，又称为自动类型转换
 * 			向下转型：downcasting
 *				父类型转换为子类型，又称为强制类型转换
 *			无论是向上转型还是向下转型，两种类型之间必须要有继承关系
 */
public class Test {

	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.move();
		Cat c1=new Cat();
		c1.move();
		c1.catchMouse();
		Brid b1=new Brid();
		b1.move();
		
		//使用多态
		//new cat()创建的对象是cat a2这个引用数据类型是Animal，可见进行了类型转换
		//子类转换为父类，称为向上转型-----upcasting
		Animal a2=new Cat();
		/**
		 * 程序都分为编译阶段和运行阶段
		 * 先分析编译阶段再分析运行阶段，编译不通过无法运行
		 * 编译阶段编译器检查a2这个引用数据类型为animal，字节码中有move方法所有编译通过了。这个过程称为静态绑定
		 * 静态绑定成功了才会有后续的运行
		 * 运行阶段，jvm堆内存中真实创建的对象是cat对象，所以move调用的是cat中的move
		 * 父类型引用指向子类型对象这种机制导致程序在编译阶段绑定和运行阶段绑定两种不同的形态状态-----这种机制称为多态
		 */
		a2.move();
		
		//brid b2=new Cat();编译报错，两种类型之间不存在继承关系
		/**
		 * 需求： 让以上对象执行catchmouse方法
		 * 	a2无法之间调用
		 * 	a2强制类型转换为cat类型，称为downcasting
		 * 
		 * 向下转型
		 * 	当调用的方法是子类型中特有的，父类型中不存在，必须向下转型
		 * 
		 * java规范要求
		 * 	强制类型转换前，使用instanceof运算符，避免错误
		 */
		Cat c2=(Cat) a2;
		c2.catchMouse();
		
		System.out.println("************************************");
		Animal a3=new Brid();//多态
		/**
		 * 编译无错，编译器检测到a3是animal，可以向下转型
		 * 
		 * 运行出错，jvm堆内存中真实存在的是brid对象，brid无法转换为cat，因为两者不存在继承关系
		 * 	java.lang.ClassCastException
		 * 	类型转换异常，这种异常总是发生在向下转型异常
		 */
		//Cat c3=(Cat) a3;
		/**
		 * 避免
		 * 		只有在强制类型转换时发生，向下转型存在隐患，编译可过，运行可能错
		 * 		向上转型只要编译过，运行不会错
		 * 		避免向下转型的java.lang.ClassCastException错误
		 * 			使用instanceof运算符可以避免
		 * 		instanceof的使用
		 * 			语法
		 * 				(引用 instanceof 数据类型名)
		 * 			执行结果类型是Boolean类型：假设：（a instanceof Animal）
		 * 				true：
		 * 					表示a这个引用指向的对象是一个animal类型
		 * 				false：
		 * 					表示a这个引用指向的对象不是一个animal类型
		 */
		//当a3指向的对象确实是cat时再强制类型转换
		if(a3 instanceof Cat){
			Cat c3=(Cat) a3;
			c3.catchMouse();
		}else if(a3 instanceof Brid){
			Brid b2=(Brid) a3;
			b2.fly();
		}
		
	}

}
