/*
	switch���
	-
	�﷨
	switch(int��string){
		case int��string������ֵ���������:
			java;
			java;
			......
			break;//����break����switch����
		case int��string������ֵ���������:
			java;
			java;
			......
			//break;û��break��һ��case����ƥ���ֱ��ִ�У���Ϊcase��͸
		case int��string������ֵ���������:
			java;
			java;
			......
			break;
		case int��string������ֵ���������:
			java;
			java;
			......
			break;
		.......
		default ://���з�֧��û��ƥ��ɹ�
			java;
			java;
			.....
	}

	-byte short char Ҳ����д��switch case����Ϊ���Խ����Զ�����ת��

	-case ���Ժϲ�
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
		System.out.print("���������ڼ�: ");
		int num=s.nextInt();
		switch(num){
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("���ַǷ�");
		}
		

		System.out.println("==================");
		//case��͸
		switch(num){
			case 1:case 0:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				//break;
			case 4:
				System.out.println("������");
				//break;
			case 5:
				System.out.println("������");
				//break;
			case 6:
				System.out.println("������");
				//break;
			case 7:
				System.out.println("������");
				//break;
			default:
				System.out.println("���ַǷ�");//���Դ�͸��default
		}
	}
}