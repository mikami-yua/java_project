package day11;
/**
 * 可以使用static关键字来定义静态代码块：
 * 
 * 	-语法格式
 * 		static{
 * 			java
 * 		}
 * 
 *	-在类加载时执行，且只执行一次
 *
 *	-在一个类中可以编写多个，遵循自上而下的顺序执行
 *
 *	-作用
 *		类装载时记录日志
 *		
 *
 */
public class StaticTest01 {
	static{
		System.out.println("类加载");
	}
	static{
		System.out.println("类加载2");
	}
	public static void main(String[] args) {
		System.out.println("main begin");

	}

}
