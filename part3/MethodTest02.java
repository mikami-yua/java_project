/*
	-方法定义的语法结构
		【修饰词列表】 返回值类型 方法名（形参列表）{
			方法体；
		}

	-解释
		-关于修饰词列表
			-可选项，不是必须的
			-目前统一写为 public static
			-方法的修饰词中有“static”关键字时的调用
				类名.方法名（实参列表）；
		-返回值类型
			-返回值
				一个方法是可以完成某个特定功能的，这个功能结束之后，大多数需要返回最终的执行结果，执行结果可能是一个具体的
				数据，数据必有类型
			-返回值类型
				java中任意一种类型，基本数据类型＋引用数据类型
			-返回值类型若不是void，表示方法执行结束后必须返回一个具体数值，不返回会报错
			-返回值是void时，不能出现“return 返回值；”这样的语句。可以有“return ;”这样的语句
			-只要return执行，则return语句所在的方法结束
		-方法名
			-合法的标识符
			-见名知意
			-首字母小写，后面每个单词首字母大写
			-遵循驼峰命名
		-形参列表
			-形参是局部变量
			-形参个数可以0-N
			-形参之间用“，”隔开
			-起决定性作用的是形参的数据类型
			-实参列表和形参列表要求数量相同，对应类型相同
		-方法体
			必须由{}括起来，体内代码由上而下顺序构成
	
	-调用
		方法在调用的时候才会执行

		-语法（由static关键字时）
			类名.方法名（实参列表）；
		

*/
//public表示公开的
//class表示定义类
//MethodTest03是一个类名
public class MethodTest02//定义一个公开的类，起名MethodTest03，由于是公开的类，所以源文件名必须：MethodTest03.java
{	
	//类体
	//不能直接编写Java语句，除声明变量之外
	//方法出现在类体中


	//方法
	//public表示公开的
	//static表示静态的
	//void表示方法执行后不返回任何数据
	//main是方法名-----主方法
	//(String[] arge):形参列表，其中String[]是一种引用数据类型，args是一个局部变量的变量名
	//所以以下只有args是随意的
	//主方法需要这样固定编写
	public static void main(String[] args){
		//这里的程序一定会执行
		//main方法是jvm调用的，是一个入口
		//作为入口程序
		//调用语法：类名.方法名
		MethodTest02.sum(10,20);//执行到这里main方法暂停，进入sum方法执行

		//一个方法可以重复调用
		MethodTest02.sum(100,20);
	}
	

	//自定义方法不是程序的入口
	//方法作用，计算两个int的和，不要求返回结果，要求打印到屏幕
	//修饰词列表：public static
	//返回值类型：void
	//方法名：sum
	//形式参数列表:(int x,int y)
	//方法体:求和后输出结果
	public static void sum(int i,int j){
		System.out.println(i+"+"+j+"="+(i+j));
	}
}