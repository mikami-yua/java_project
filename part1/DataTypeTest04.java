/*
	整数类型
		byte int short long


	-整数型字面值被默认当作int类型来处理,想要当作long类型来处理，需要在字面值后面加l\L
	 建议使用L

	-整数型字面值有三种表示方式
		八进制【以0开头】
		10进制【默认】
		16进制【ox开头】
*/
public class DataTypeTest04
{
	public static void main(String[] args){
		int a=10;
		int b=010;
		int c=0x10;

		System.out.println(a);//10
		System.out.println(b);//8
		System.out.println(c);//16
		
		//456整数型字面值被当作int类型,占用4个字节
		//x变量被声明的时候当作long类型，占用8个字节
		//int类型的456赋值给long类型的x存在类型转换
		//小容量可以自动转换为大容量，称为自动类型转换机制
		long x=456;
		System.out.println(x);

		//字面值溢出，跟long无关
		//long y=2147483648;//错误: 过大的整数: 2147483648
		
		//字面值一上来就当作long处理，后面加L
		//以下程序不存在类型转化
		long y=2147483648L;
		System.out.println(y);

	}
}