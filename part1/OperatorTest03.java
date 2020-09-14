/*
	逻辑运算符
		&	与			T  T
		|	或			T
		!	非			!F=T
		^	异或		两边不一样就是T

		||	短路或		
		&&	短路与
			和& |运算结果相同

	-要求两边算子是Boolean类型
	-短路回存在短路现象
	-什么是短路现象
	-什么时候使用短路

*/
public class OperatorTest03
{
	public static void main(String[] args){

		System.out.println(5>3 & 5>2);
		System.out.println(5>3 & 5>6);
		System.out.println(5>3 | 5>6);
		System.out.println(true ^ false);
		System.out.println(true ^ true);

		//逻辑与和短路与
		/*
		int x=10;
		int y=12;
		System.out.println(x>y & ++x<y);
		System.out.println(x);//11
		System.out.println(y);
		*/

		int x=10;
		int y=12;
		System.out.println(x>y && ++x<y);//运行到左边就产生短路不在运行右边
		System.out.println(x);//10
		

	}
}