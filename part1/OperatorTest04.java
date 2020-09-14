/*
	赋值类运算符
	俩种
		基本的赋值运算符
			=	

		扩展的赋值运算符
			+=
			-=
			*=
			/=
			&=

		都是先执行等号右边的再赋值给左边
*/
public class OperatorTest04
{
	public static void main(String[] args){
		int i=10;
		i+=5;//等价于 i=i+5
		System.out.println(i);//15 +=可以翻译为追加

		i-=5;
		System.out.println(i);//10

		byte b=10;
		//b=b+5;//java:27: 错误: 不兼容的类型: 从int转换到byte可能会有损失 b=b+5;b+5是int类型而b是byte类型
		//b=15 不会出错
		b=(byte)(b+5);

		byte x=10;
		x+=5;//可以通过编译   等同于b=(byte)(b+5);并不等同于x=x+5;
		System.out.println(x);
		
		byte z=0;
		z+=128;//损失精度  z=(byte)(z+128);
		System.out.println(z);//-128
	}
}