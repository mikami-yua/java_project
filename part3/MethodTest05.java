/*
	��������
	
	-��static�ؼ��ֵĿ���ʡ��������д
	
	-������õĳ���ͱ����ó�����һ�����У���������ʡ��
	

	��ʵ�ʿ�����һ��Java�ļ�дһ��class��
*/
public class MethodTest05{
	public static void main(String[] args){
		MethodTest05.m();

		m();//��static����ʡ�Բ�д

		//���������಻�Ǳ����еķ���
		A.doOther();
		//ʡ������
		//doOther();����: �Ҳ�������

		//������ñ����е�m2����Ҫ�������
		A.m2();
	}
	public static void m(){
		System.out.println("mmmmmmmm");
		m2();//���Ե���
	}

	public static void m2(){
		System.out.println("2222222222222");
	}
}

class A
{
	public static void doOther(){
		System.out.println("class A");
	}

	public static void m2(){
		System.out.println("AAAAAAAAAAAAAAAA2222222222222");
	}
}

//p87-14.27