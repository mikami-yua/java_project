/*
	һ�������ʵ�ֶ���ӿ���
		���ԡ�******���ֲ���Java�������ֻ�ܵ��̳е�ȱ��
	
	֮ǰ�Ľ��ۣ�
		��������ת�ͻ�������ת�ͣ���������֮������м̳й�ϵ��û�м̳й�ϵ�������ᱨ������Ӧ�ڽӿڣ�
		���պ�ʵ��һ������Ҫ�ӣ�instanceof����������ж�
		����ת�����ɺ�ϰ��ʹ��
			if(m instanceof K)�ж�
*/
public class Test03
{
	public static void main(String[] args){
		//��̬
		A a=new D();
		//a.m2();���뱨��A�ӿ���û��m2����
		B b=new D();
		C c=new D();
		//���������ӿ��еķ�����Ҫ�ӿ�ת��
		//a.m2();����
		B b2=(B)a;
		b2.m2();//��������û����
		
		//����ת��
		D d =(D)a;
		d.m2();
//��������������������������������������������������������������������������������������������������������
		M m=new E();
		//�������ԣ��ӿںͽӿ�֮�����ǿ������ת����ʱ��û�����͹�ϵ��Ҳ����ǿת
		//������ʱ���ܳ���ClassCastException
		//K k=(K)m;//����û���⣬����������
		if(m instanceof K){
			K k=(K)m;
		}
	}
}
interface K
{
}

interface M
{
}

class E implements M
{
}

//__________________________________________________________________________________________
interface A
{
	void m1();
}
interface B
{
	void m2();
}
interface C
{
	void m3();
}

class D implements A,B,C
{
	public void m1(){
	
	}

	public void m2(){
		System.out.println("m2......");
	}

	public void m3(){
	
	}
}