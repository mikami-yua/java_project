/*
	switch语句
	-
	语法
	switch(int或string){
		case int或string的字面值变量或变量:
			java;
			java;
			......
			break;//遇到break整个switch结束
		case int或string的字面值变量或变量:
			java;
			java;
			......
			//break;没有break下一个case不会匹配会直接执行，称为case穿透
		case int或string的字面值变量或变量:
			java;
			java;
			......
			break;
		case int或string的字面值变量或变量:
			java;
			java;
			......
			break;
		.......
		default ://所有分支都没有匹配成功
			java;
			java;
			.....
	}

	-byte short char 也可以写到switch case后，因为可以进行自动类型转换

	-case 可以合并
		int i=10;
		switch(i){
			case1:case2:case3:case10:
				System.out.println("Test Code");
		}

*/

public class SwitchTest01
{
	public static void main(String[] arge){
		
		long x=100L;
		switch((int)x){}

		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("请输入星期几: ");
		int num=s.nextInt();
		switch(num){
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("数字非法");
		}
		

		System.out.println("==================");
		//case穿透
		switch(num){
			case 1:case 0:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				//break;
			case 4:
				System.out.println("星期四");
				//break;
			case 5:
				System.out.println("星期五");
				//break;
			case 6:
				System.out.println("星期六");
				//break;
			case 7:
				System.out.println("星期日");
				//break;
			default:
				System.out.println("数字非法");//可以穿透到default
		}
	}
}