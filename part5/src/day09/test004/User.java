package day09.test004;
/**
 * 封装的步骤
 * @author jia
 * 1.所以属性私有化使用private修饰，修饰的数据只能在本类中使用
 * 2.对外提高简单的操作入口
 * 		-对外提供两个公开的方法，get和set
 * 3.set方法的命名规范：
 * 		public static set+属性名首字母大写（形参）{
 * 		}
 * 4.get方法的命名规范：
 * 		public int getAge(){
 * 			return age;
 * 		}
 * 
 * 
 * 一个属性访问的时候通常的访问形式有：
 * 	-读取---get
 * 	-修改---set
 * 
 * 先背会以下内容
 * 	-setter and getter方法没有static关键字
 * 	-有static关键字修饰的方法：类名.方法名（实参）
 * 	-没有static关键字的修饰方法：引用.方法名（实参）
 */

public class User {
	//属性私有化
	private int age;
	
	//set方法没有返回值，只负责修改数据
	public void setAge(int a){
		//编写业务逻辑进行控制
		if(a < 0 || a > 150){
			System.out.println("年龄不合法");
			return;
		}
		
		age=a;
	}
	
	//get
	public int getAge(){
		return age;
	}
	
	
	
}
