/*
	浮点型
		float【4byte】
		double【8byte】

		double精度太低，不适合做财务软件
		官方提供了精度更高的类型java.math.BigDecimal

		java有很多类库，需要知道se类库
			SE类库的字节码：C:\Program Files\Java\jdk1.8.0_111\jre\lib\rt.jar
			SE类库的源码：C:\Program Files\Java\jdk1.8.0_111\src.zip

			(String[] args)中的String就是使用String.class字节码文件

		java中所有的浮点型默认double
		若要当作float需要在字面值后面加f/F
*/
public class DataTypeTest06
{
	public static void main(String[] args){
		
		//不存在类型转换
		double d=3.0;
		System.out.println(d);

		//float f=5.1;
		//错误: 不兼容的类型: 从double转换到float可能会有损失
		float f1=(float)5.1;
		float f2=5.1F;
		System.out.println(f2);
	}
}