/*
	��ֵ�������
	����
		�����ĸ�ֵ�����
			=	

		��չ�ĸ�ֵ�����
			+=
			-=
			*=
			/=
			&=

		������ִ�еȺ��ұߵ��ٸ�ֵ�����
*/
public class OperatorTest04
{
	public static void main(String[] args){
		int i=10;
		i+=5;//�ȼ��� i=i+5
		System.out.println(i);//15 +=���Է���Ϊ׷��

		i-=5;
		System.out.println(i);//10

		byte b=10;
		//b=b+5;//java:27: ����: �����ݵ�����: ��intת����byte���ܻ�����ʧ b=b+5;b+5��int���Ͷ�b��byte����
		//b=15 �������
		b=(byte)(b+5);

		byte x=10;
		x+=5;//����ͨ������   ��ͬ��b=(byte)(b+5);������ͬ��x=x+5;
		System.out.println(x);
		
		byte z=0;
		z+=128;//��ʧ����  z=(byte)(z+128);
		System.out.println(z);//-128
	}
}