/*
	�����ڲ���
		-�ڲ���
			����ڲ��ֶ�����һ����

		-�ڲ������
			��̬�ڲ��ࣺ���ƾ�̬����
			ʵ���ڲ��ࣺ����ʵ������
			�ֲ��ڲ��ࣺ���ƾֲ�����

		-ʹ���ڲ���д�Ĵ���ɶ��Բ�

		-�����ڲ����Ǿֲ��ڲ����һ��
			�����ڲ���û������

		-������ʹ�������ڲ���
*/

public class Test01
{
	static class Inner1//��̬�ڲ���
	{
	}

	class Inner2//û��static��ʵ���ڲ���
	{
	}

	public void doSome(){
		
		class Inner3//�ֲ��ڲ���
		{
		}
	}

	public static void main(String[] args){
		MyMath mm=new MyMath();
		//����д������------������ComputeImpl()
		mm.mySum(new ComputeImpl(),100,200);

		//�����ڲ���------֮��new�ӿ�
		MyMath mm1=new MyMath();
		mm1.mySum(new Compute(){
			public int sum(int a,int b){
				return a+b;
			}
		},200,300);
	}
}

interface Compute
{
	int sum(int a, int b);
}

class ComputeImpl implements Compute
{
	public int sum(int a,int b){
		return a+b;
	}
}

class MyMath
{
	public void mySum(Compute c,int x,int y){
		int retValue=c.sum(x,y);
		System.out.println(retValue);
	}
}