/*
	ʵ�ּ�������+-*%/	
*/

public class SwitchTest03
{
		public static void main(String[] args){
			/*
			//java.util.Scanner s1=new java.util.Scanner(System.in);ֻ��Ҫ����һ�ξͿ���ʵ�ֶԶ������������
			java.util.Scanner s1=new java.util.Scanner(System.in);
			System.out.print("�������һ�����֣� ");
			int firstNum=s1.nextInt();
			java.util.Scanner s2=new java.util.Scanner(System.in);
			System.out.print("������������� ");
			int operator=s2.next();
			java.util.Scanner s3=new java.util.Scanner(System.in);
			System.out.print("��������������֣� ");
			int secondNum=s3.nextInt();
			*/
			java.util.Scanner s=new java.util.Scanner(System.in);//ֻ��Ҫ����һ��
			System.out.print("�������һ�����֣� ");
			int firstNum=s.nextInt();
			System.out.print("������������� ");
			String operator=s.next();
			System.out.print("������ڶ������֣� ");
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
					System.out.println("��������Ϸ�");
			}


		}
}