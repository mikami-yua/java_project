package day09.test001;

/*
 * 
 * *
 * ѧ��������
 */
public class StudentTest {
	
	//main�����Զ���ȫ������main alt+/�Զ���ȫ
	public static void main(String[] args) {
		//����ѧ������
		Student s=new Student();
		//���ʶ�������
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.addr);
		System.out.println(s.sex);
		System.out.println(s.age);
		
		s.no=10;
		s.name="zhangsan";
		System.out.println(s.no);
		System.out.println(s.name);
		
	}

}
