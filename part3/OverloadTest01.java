/*
	��������

	-���ڹ������Ƶķ���

	-��Ȼ���õĲ�ͬ���������Ǿ���ʹ��һ������һ��
*/

public class OverloadTest01
{
	public static void main(String[] args){
		//��ʱ���������������������֣�����������������
		System.out.println(sum(1,2));//���������Ͳ�ͬ�����õķ�����ͬ
		System.out.println(sum(1.0,2.0));
		System.out.println(sum(1L,2L));
		U.p("aaaaaaaaaaaa");
	}

	//���巽����������int�ĺ�
	//���巽����������double�ĺ�
	//���巽����������float�ĺ�

	//�����������������˷���������
	public static int sum(int a,int b){
		return a+b;
	}
	public static double sum(double a,double b){
		return a+b;
	}
	public static long sum(long a,long b){
		return a+b;
	}
}