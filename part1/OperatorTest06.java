/*
	��Ԫ�����
		-�﷨����
			�������ʽ?���ʽ1�����ʽ2
		-ִ��ԭ��
			����Ϊ�� ѡ����ʽ1��Ϊ�������ʽ��ִ�н��
			����Ϊ�� ѡ����ʽ2��Ϊ�������ʽ��ִ�н��

*/
public class OperatorTest06
{
	public static void main(String[] args){
		boolean sex= false;
		//sex? '��':'Ů';//����: �������
		char c=sex? '��':'Ů';
		System.out.println(c);

		//char c1=sex? "��":'Ů';//����: �����ݵ�����: �������ʽ�е����ʹ��� ���������string
		
		
		System.out.println(sex? "��":'Ů');//����

	
	}
}