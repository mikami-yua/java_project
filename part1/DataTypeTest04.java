/*
	��������
		byte int short long


	-����������ֵ��Ĭ�ϵ���int����������,��Ҫ����long������������Ҫ������ֵ�����l\L
	 ����ʹ��L

	-����������ֵ�����ֱ�ʾ��ʽ
		�˽��ơ���0��ͷ��
		10���ơ�Ĭ�ϡ�
		16���ơ�ox��ͷ��
*/
public class DataTypeTest04
{
	public static void main(String[] args){
		int a=10;
		int b=010;
		int c=0x10;

		System.out.println(a);//10
		System.out.println(b);//8
		System.out.println(c);//16
		
		//456����������ֵ������int����,ռ��4���ֽ�
		//x������������ʱ����long���ͣ�ռ��8���ֽ�
		//int���͵�456��ֵ��long���͵�x��������ת��
		//С���������Զ�ת��Ϊ����������Ϊ�Զ�����ת������
		long x=456;
		System.out.println(x);

		//����ֵ�������long�޹�
		//long y=2147483648;//����: ���������: 2147483648
		
		//����ֵһ�����͵���long���������L
		//���³��򲻴�������ת��
		long y=2147483648L;
		System.out.println(y);

	}
}