/*
	实现计算器的+-*%/	
*/

public class SwitchTest03
{
		public static void main(String[] args){
			/*
			//java.util.Scanner s1=new java.util.Scanner(System.in);只需要出现一次就可以实现对多个参数的输入
			java.util.Scanner s1=new java.util.Scanner(System.in);
			System.out.print("请输入第一个数字： ");
			int firstNum=s1.nextInt();
			java.util.Scanner s2=new java.util.Scanner(System.in);
			System.out.print("请输入运算符： ");
			int operator=s2.next();
			java.util.Scanner s3=new java.util.Scanner(System.in);
			System.out.print("请输入第三个数字： ");
			int secondNum=s3.nextInt();
			*/
			java.util.Scanner s=new java.util.Scanner(System.in);//只需要定义一次
			System.out.print("请输入第一个数字： ");
			int firstNum=s.nextInt();
			System.out.print("请输入运算符： ");
			String operator=s.next();
			System.out.print("请输入第二个数字： ");
			int secondNum=s.nextInt();

			switch(operator){
				case"+":
					System.out.println(firstNum+secondNum);
					break;
				case"-":
					System.out.println(firstNum-secondNum);
					break;
				case"*":
					System.out.println(firstNum*secondNum);
					break;
				case"/":
					System.out.println(firstNum/secondNum);
					break;
				case"%":
					System.out.println(firstNum%secondNum);
					break;
				default:
					System.out.println("运算符不合法");
			}


		}
}