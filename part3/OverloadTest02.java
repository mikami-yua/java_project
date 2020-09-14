/*
	方法重载

	-什么时候使用使用
		功能相似的时候

	-什么条件满足后构成了方法重载
		-在同一个类中
		-方法名相同
		-参数列表不同
			-参数数量不同
			-顺序不同
			-类型不同

	-方法重载和什么有关系
		-和方法名+参数列表有关
		-和返回值类型无关
		-和修饰词列表无关
*/
public class OverloadTest02
{
	public static void main(String[] args){
		System.out.println("helloword");
		System.out.println(10);
		System.out.println(true);

		U.p(10);
		U.p(true);
		U.p("helloword");
	}

}

//自定义类
class U
{
	public static void p(byte b){
		System.out.println(b);
	}
	public static void p(short b){
		System.out.println(b);
	}
	public static void p(int b){
		System.out.println(b);
	}
	public static void p(long b){
		System.out.println(b);
	}
	public static void p(float b){
		System.out.println(b);
	}
	public static void p(double b){
		System.out.println(b);
	}
	public static void p(boolean b){
		System.out.println(b);
	}
	public static void p(char b){
		System.out.println(b);
	}
	public static void p(String b){
		System.out.println(b);
	}
}