/*
	java�е�������
*/
public class DataTypeTest05
{
	public static void main(String[] args){
		

		long x=100L;
		//x����long����8�ֽ�
		//y��int��4�ֽ�
		//int y=x;//����: �����ݵ�����: ��longת����int���ܻ�����ʧ
		//����������ֱ�Ӹ�ֵ��С��������Ҫǿ������ת��
		//ǿ������ת������ͨ�������н׶ο�����ʧ����
		//����ʹ��
		//ǿ������ת�� ����������ֽ�
		int y=(int)x;
		System.out.println(y);


		long k=2147483648L;
		int e=(int)k;
		System.out.println(e);//-2147483648

		//byteֻҪ������128������ôд
		byte b=50;

		byte b1=(byte)128;//-128
	}
}