/*
	算术运算符
		+
		-
		*
		/
		%
		++ 自加1
		-- 自减1



*/
public class OperatorTest01
{
	public static void main(String[] args){
		int i=10;
		int j=3;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j);
		
		//++
		int k=10;
		k++;
		System.out.println(k);
		int y=10;
		++y;
		System.out.println(y);

		int a=100;
		int b=a++;//先赋值，再自加,
		System.out.println(b);//100



	}
}