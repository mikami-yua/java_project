/*
	������
		float��4byte��
		double��8byte��

		double����̫�ͣ����ʺ����������
		�ٷ��ṩ�˾��ȸ��ߵ�����java.math.BigDecimal

		java�кܶ���⣬��Ҫ֪��se���
			SE�����ֽ��룺C:\Program Files\Java\jdk1.8.0_111\jre\lib\rt.jar
			SE����Դ�룺C:\Program Files\Java\jdk1.8.0_111\src.zip

			(String[] args)�е�String����ʹ��String.class�ֽ����ļ�

		java�����еĸ�����Ĭ��double
		��Ҫ����float��Ҫ������ֵ�����f/F
*/
public class DataTypeTest06
{
	public static void main(String[] args){
		
		//����������ת��
		double d=3.0;
		System.out.println(d);

		//float f=5.1;
		//����: �����ݵ�����: ��doubleת����float���ܻ�����ʧ
		float f1=(float)5.1;
		float f2=5.1F;
		System.out.println(f2);
	}
}