package day10;
/**
 *this关键字
 *
 *	-翻译为这个
 *
 *	-this是一个引用，this是一个变量，this变量中保存了内存地址指向自身，this存储在 jvm堆内存Java对象内部
 *	
 *	-this可以出现在实例方法中，指向当前正在执行这个动作的对象
 *
 *	-this多数情况可以省略不写
 *
 */
public class Customer {
	
	String name;
	
	public Customer(){
		
	}
	
	//购物行为
	//最终结果不同，所以购物属于对象级的行为,由于每个对象在执行购物动作时的结果不同，所以购物必须有“对象”参与
	//重点：没有static关键字的方法称为实例方法,引用.
	//重点：没有static关键字的变量称为实例变量
	//当一个动作，行为，执行过程中需要对象参与，那么这个方法一定要定义为实例方法，不带static。
	public void shopping(){
		//张三在购物时输出张三在购物
		//李四输出李四
		System.out.println(name +"在购物");//一种省略的方式
		//完整写法
		//System.out.println(引用.name +"在购物");
		System.out.println(this.name +"在购物");//完整的写法
	}
	
	//带static
	public static void doSome(){
		//执行过程中没有当前对象，带有static修饰的方法通过类名访问
		//或者说上下文没有当前对象
		//System.out.println(name);报错
	}
	public static void doOther(){
		//想访问name
		//1.创建对象
		Customer c=new Customer();
		System.out.println(c.name);//访问的不是当前对象的name
		
	}
}
