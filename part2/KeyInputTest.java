/*
	���ܼ�������

	���̵��ڴ�
*/
public class KeyInputTest
{
	public static void main(String[] args){
		//1.��������ɨ��������
		java.util.Scanner s=new java.util.Scanner(System.in);
		//2.����Scanner�����next����������ʼ�����û��ļ�������
		//����ִ�е������ͣ�����ȴ��û�������
		//���û������ʱ�򣬲������ûس���ʱ����Ϣ�ᱻ�Զ���ֵ��userInputContent
		//�����ַ�������ʽ�����ı���
		String userInputContent = s.next();
		
		//����������ʽ��������
		int num=s.nextInt();


		//�û��������Ϣ�Ѿ����ڴ���
		
		//���ڴ��е����������̨
		System.out.println("�������ˣ� "+userInputContent);
		System.out.println("�������ˣ� "+num);
	}
}