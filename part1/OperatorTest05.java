/*
	java�ֵġ�+��
		-�ӷ�����
			���߶�������

			����ӺŴ��������μ�

		-�ַ�������������
			ֻҪ��һ���������ַ������ͽ����ַ����������㣬�����Ȼ�Ǹ��ַ���
*/
public class OperatorTest05
{
	public static void main(String[] args){

		System.out.println(10+20+"30");//��һ���Ӻ���ͣ��ڶ����Ӻ����ַ�������    3030
		System.out.println(10+(20+"30"));//102030
		int a=10;
		int b=20;
		//����̨�����10+20=30��
		System.out.println(a +"+"+ b+ "="+ (a+b));

		//��������string
		int i=10;
		String userName="zhnags";
		System.out.println("��¼�ɹ�"+userName+"��ӭ");
		

	
	}
}