/*
	�ӿ�
		-��һ��������������
		-�ӿ�����ȫ����ģ��������ǰ����ģ����ӿ�������ĳ�����
		-�﷨
			�����η��б� interface �ӿ���{
			}
		-�ӿڱ���֮��Ҳ��class�ֽ����ļ�

		-�ӿ�֧�ֶ�̳У�һ���ӿڿ��Լ̳ж���ӿ�

		-�ӿ���ֻ��
			-����
			-���󷽷�
			û����������
		-�ӿ�������Ԫ�ض���public
		-�ӿ��еĳ��󷽷�����ʱpublic abstract����ʡ��
		-�ӿ��еķ��������з�����
		-�ӿ��еĳ�����public static final����ʡ��

*/
public class Test01
{
	public static void main(String[] args){
		//���ʽӿڳ���
		System.out.println(MyMath.PI);
		
	}
}
//����ӿ�
interface A
{
}
interface B
{
}
interface C extends A,B
{
}
interface MyMath
{	
	//����
	public static final double PI = 3.1415926;
	//������public static final����ʡ��
	double p=3.14;

	//���󷽷�
	public abstract int sum(int a,int b);

	//�ӿ��ж��ǳ��󷽷���public abstract����ʡ��
	int div(int a,int b);

	int sub(int a,int b);
}