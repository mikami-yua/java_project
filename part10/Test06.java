/*
	����Object���е�finalize����
		-Դ����
			protected void finalize() throws Throwable { }

			GC�������

		-finalizeû�з�����

		-����Ҫ�ֶ����ã�jvm�����������Զ�����

		-finalize��ִ��ʱ��
			��һ��java���󼴽�����������������ʱ�������������������finalize����

		-finalizeʵ����Ϊ������׼����һ��ʱ����һ����������ʱ��
			���ϣ����������ʱ��ִ��һ�δ��룬��δ���д��finalize��

		-��̬�����
			static{

				������
			}
			������ص�ʱ��ִ�У���ִֻ��һ��

		-java�е�����������������������
			�����٣�ʱ��û�������п��ܲ�����
			
*/
public class Test06
{
	public static void main(String[] args){
		Person p = new Person();

		//�����������������p.finalize
		//��ô�������
		p = null;//δ������������

		/*
		//��������
		for (int i=0; i<100000000 ; i++ )
		{
			Person p1 = new Person();
			p1 = null;
		}
		*/

		//������������������
		Person p1 = new Person();
		p1 = null;
		System.gc();//���ܲ�����   Person@25d02c7d����������
	}
}

class Person
{
	//��дfinalize
	protected void finalize() throws Throwable { 
		System.out.println(this + "����������");
	}

}