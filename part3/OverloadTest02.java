/*
	��������

	-ʲôʱ��ʹ��ʹ��
		�������Ƶ�ʱ��

	-ʲô��������󹹳��˷�������
		-��ͬһ������
		-��������ͬ
		-�����б�ͬ
			-����������ͬ
			-˳��ͬ
			-���Ͳ�ͬ

	-�������غ�ʲô�й�ϵ
		-�ͷ�����+�����б��й�
		-�ͷ���ֵ�����޹�
		-�����δ��б��޹�
*/
public class OverloadTest02
{
	public static void main(String[] args){
		System.out.println("helloword");
		System.out.println(10);
		System.out.println(true);

		U.p(10);
		U.p(true);
		U.p("helloword");
	}

}

//�Զ�����
class U
{
	public static void p(byte b){
		System.out.println(b);
	}
	public static void p(short b){
		System.out.println(b);
	}
	public static void p(int b){
		System.out.println(b);
	}
	public static void p(long b){
		System.out.println(b);
	}
	public static void p(float b){
		System.out.println(b);
	}
	public static void p(double b){
		System.out.println(b);
	}
	public static void p(boolean b){
		System.out.println(b);
	}
	public static void p(char b){
		System.out.println(b);
	}
	public static void p(String b){
		System.out.println(b);
	}
}