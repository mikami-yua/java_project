/*
	����Ĵ�����ʹ��
*/
public class OOTest01
{
	public static void main(String[] args){
		
		int i=10;//i�������10
		//ʵ����һ��������﷨
		//new ��������;
		//new��Java��һ�����������������jvm���ڴ��п����µ��ڴ�ռ�
		//�������ڴ棺�����ʱ��class�ֽ������Ƭ�α����ص����ڴ�ռ���
		//���ڴ棺new�Ķ���
		//ջ�ڴ棺��������ִ��ʱ�������������ڴ�ռ䣬��ջ�ڴ���ѹջ
		Student s=new Student();//Student��һ�������������ͣ�s��һ����������new Student()��һ��ѧ������
		//s��һ���ֲ���������ջ�ڴ��У�s������Ǹö����ڶ��ڴ��еĵ�ַ��s��֮Ϊ���á����Ƕ���
		//������new������ڶ��ڴ��п��ٵ��ڴ�ռ��Ϊ����
		//������һ��������ֻ������������б�������һ��java�������ڴ��еĵ�ַ
		//java�в���ֱ�Ӳ������ڴ棬ֻ��ͨ������ȥ���ʶ��ڴ��ж����ڲ���ʵ������
		//�����﷨
		//��ȡ������.������
		//�޸ģ�����.������=ֵ

		int stuNo=s.no;
		String stuName=s.name;
		int stuAge=s.age;
		boolean stuSex=s.sex;
		String stuAddress=s.address;

		System.out.println(stuNo);
		System.out.println(stuName);
		System.out.println(stuAge);
		System.out.println(stuSex);
		System.out.println(stuAddress);


		s.no=10;
		s.name="jack";
		s.age=20;
		s.sex=true;
		s.address="beijing";

		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sex);
		System.out.println(s.address);

		//��ͨ����ʵ����һ��
		Student stu=new Student();
		
		//�ֲ�������ջ�ڴ��д洢
		//��Ա�����е�ʵ��������Java�����ڲ��洢
		//ʵ��������һ������һ��

	}
}