package day09.test005;
/**
 * 关于Java类中的构造方法
 * 	1.构造方法也被称为构造器 Constructor
 * 	2.语法结构
 * 		【修饰词列表】 构造方法名（形式参数列表）{
 * 			构造体；
 * 		}
 * 	3.普通方法
 * 		【修饰词列表】 返回值类型 方法名（形式参数）{
 * 		}
 * 	4.对应构造方法来说，返回值类型不需要指定
 * 		只要写上void就成普通方法了
 * 	5.对于构造方法来说，方法名必须和类名一致
 * 	6.构造方法的作用
 * 		通过构造方法的调用创建对象
 * 	7.构造方法的调用
 * 		-普通方法：有static关键字时：类名.方法名（实参列表）   没有static时：引用.方法名（实参列表）
 * 		-构造方法：new 构造方法名（实参列表）;
 * 	8.构造方法执行结束之后,都有返回值，但是return值这样的语句不需写，java自动返回
 * 		返回值类型是构造方法所在类的类型
 * 	9.当一个类中没有定义任何构造方法的话，系统默认提供一个无参的构造方法，称为缺省构造器
 * 	10.显示的定义构造方法后，系统不再默认提供缺省构造器.建议开发中手动的为当前类提供无参数的构造方法
 * 		因为无参数的构造方法太常用了
 * 	11.构造方法是可以重载的
 * 
 * 
 *
 */
public class ConstructorTest01 {

	public static void main(String[] args) {
		
		//创建user对象
		//调用user的构造方法
		User u1 = new User();
		User u2 = new User(10);
		User u3 = new User("zhangsan");
		User u4 = new User(10,"zhangsan");
		
		
		//带有static的方法：类名.
		ConstructorTest01.doSome();
		doSome();
		
		//无static的方法：引用.
		ConstructorTest01 t = new ConstructorTest01();
		t.doOther();
		

	}
	
	/**
	 * 这种注释适合用在类名和方法名上，鼠标移动上就能看到注释
	 */
	public static void doSome(){
		System.out.println("do some");
	}
	public void doOther(){
		System.out.println("do other");
	}

}
