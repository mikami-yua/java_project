/*
	�߼������
		&	��			T  T
		|	��			T
		!	��			!F=T
		^	���		���߲�һ������T

		||	��·��		
		&&	��·��
			��& |��������ͬ

	-Ҫ������������Boolean����
	-��·�ش��ڶ�·����
	-ʲô�Ƕ�·����
	-ʲôʱ��ʹ�ö�·

*/
public class OperatorTest03
{
	public static void main(String[] args){

		System.out.println(5>3 & 5>2);
		System.out.println(5>3 & 5>6);
		System.out.println(5>3 | 5>6);
		System.out.println(true ^ false);
		System.out.println(true ^ true);

		//�߼���Ͷ�·��
		/*
		int x=10;
		int y=12;
		System.out.println(x>y & ++x<y);
		System.out.println(x);//11
		System.out.println(y);
		*/

		int x=10;
		int y=12;
		System.out.println(x>y && ++x<y);//���е���߾Ͳ�����·���������ұ�
		System.out.println(x);//10
		

	}
}