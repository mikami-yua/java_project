/*
	java�е�string��û����дtostring����

		-string����д��equals

		-string����д��tostring

		Java��ʲô���͵�����ʹ��==�ж�---------------������������
							ʹ��equals����-----------������������
*/
public class Test03
{
	public static void main(String[] args){
		//�󲿷�����£����������ķ�ʽ�����ַ�������
		String s1="hello";


		//ʵ����string�Ǹ���
		String s2=new String("test1");
		String s3=new String("test2");
		System.out.println(s2==s3);//false s2,s3������ڴ��ַ��ͬ

		//�Ƚ��ַ���������˫�Ⱥţ�����ʹ��equals����
		System.out.println(s2.equals(s3));//true

		String s4=new String("test3");
		System.out.println(s4.toString());//test3

	}
}