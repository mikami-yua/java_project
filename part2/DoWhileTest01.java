/*
	do...while
	-语法结构
		do{
			循环体;
		}while(布尔表达式)；
	-原理
	-循环次数
		循环体执行次数1-N
		至少执行一次
	-注意事项
		while后有;
*/
public class DoWhileTest01
{
	public static void main(String[] args){
		int i=10;

		do{
			System.out.println(i);
		}while(i>100);
		
		System.out.println("------------------------------------");

		while(i>100){
			System.out.println(i);
		}

		System.out.println("------------------------------------");

		int j=1;
		do{
			System.out.println(j);
			j++;
		}while(j<=10);

	}
}