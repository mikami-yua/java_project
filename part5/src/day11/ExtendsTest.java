package day11;
/**
 * 继承
 * 		-是面向对象三大特征之一
 * 		-继承的作用是代码复用，最重要的作用是：方法的覆盖和多态
 * 		-继承语法格式
 * 			【修饰符列表】 class 类名 extends 父类名{
 * 				类体=属性+方法		
 * 			}
 *		-继承只支持单继承，一个类不能同时继承很多类，只能继承一个类。
 *		-继承中的术语
 *			B类继承A类
 *				A类称为：父类，基类，superclass
 *				B类称为：子类，派生类，subclass
 *		-子类继承父类，继承的数据
 *			-私有的不支持继承
 *			-构造方法不支持继承
 *			-其他都可以继承
 *		-虽然只支持单继承，但也可以间接继承其他类
 *			C extends B{
 *			}
 *			B extends A{
 *			}
 *			A extends T{
 *			}
 *			C直接继承B 间接继承T，A
 *		-一个类没有显示的继承任何类，该类默认继承object类
 */
public class ExtendsTest {

	public static void main(String[] args) {
		
		CreditAccount act=new CreditAccount();
		act.setActno("act-001");
		act.setBalance(-1000);
		act.setCredit(0.99);
		
		System.out.println(act.getActno()+","+act.getBalance()+","+act.getCredit());

	}

}
