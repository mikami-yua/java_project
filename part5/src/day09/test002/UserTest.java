package day09.test002;
/*
 �Ե�ǰ������˵��user�е�age�������ⲿ����������ʣ�����age�Ĳ���ȫ
 �û������䲻����Ϊ��������������ʱ��û�б���
 
 ��ǰ��Ҫ�����װ�ĺô���������������װ���̳У���̬��
 	-��װ�󣬶���������˵�������Է�װ�����ṩ�򵥵Ĳ������
 	-��װ֮��Ż��γ������Ķ����壬�����Ķ���
 	-��װ��ζ���Ժ�ĳ�������ظ�ʹ�ã�����Ӧ��ǿ
 	-��װ�����ﱾ������˰�ȫ��
 	
 */
public class UserTest {
	public static void main(String[] args) {
		// ����user����

		User user = new User();
		System.out.println("���û����䣺 " + user.age);
		user.age = 20;
		System.out.println("���û������䣺 " + user.age);
		//age������ȫ��¶������user�в������ݲ���ȫ�������װ
		//���������������
		user.age=-100;
		System.out.println("���û������䣺 " + user.age);
		
	}
}
