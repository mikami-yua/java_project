/*
	java�е�ת���ַ�
		\

*/
public class DataTypeTest03
{
	public static void main(String[] args){
		char c1='n';
		System.out.println(c1);
		char c2='\n';//���з�
		//System.out.println(c2);
		System.out.print("Hello");//print���������
		System.out.println(c2);
		System.out.println("World!");



		char c3='\t';//�Ʊ��-table
		
		System.out.print("A");
		System.out.print(c3);
		System.out.println("B");


		//���\
		//char c4='\';\��'ת��Ϊ����ͨ��',''������һ��
		char c4='\\';//��һ����б�ܽ���һ����б��ת��Ϊ��ͨ�ķ�б��
		System.out.println(c4);

		//���'
		char c5='\'';
		System.out.println(c5);
		//���"
		char c6='\"';
		System.out.println(c6);
		char c7='"';
		System.out.println(c7);
		//c6,c7������


		//�����""��helloworld
		System.out.println("\"helloworld\"");

		//jdk�д��е�native2ascii.exe���Խ�����ת��ΪUnicode����
		char c8='��';
		System.out.println(c8);
		char c9='\u4e2d';
		System.out.println(c9);
		char c10='\u0000';//��
		System.out.println(c10);
	}
}