package day10;
/**
 *this�ؼ���
 *
 *	-����Ϊ���
 *
 *	-this��һ�����ã�this��һ��������this�����б������ڴ��ַָ������this�洢�� jvm���ڴ�Java�����ڲ�
 *	
 *	-this���Գ�����ʵ�������У�ָ��ǰ����ִ����������Ķ���
 *
 *	-this�����������ʡ�Բ�д
 *
 */
public class Customer {
	
	String name;
	
	public Customer(){
		
	}
	
	//������Ϊ
	//���ս����ͬ�����Թ������ڶ��󼶵���Ϊ,����ÿ��������ִ�й��ﶯ��ʱ�Ľ����ͬ�����Թ�������С����󡱲���
	//�ص㣺û��static�ؼ��ֵķ�����Ϊʵ������,����.
	//�ص㣺û��static�ؼ��ֵı�����Ϊʵ������
	//��һ����������Ϊ��ִ�й�������Ҫ������룬��ô�������һ��Ҫ����Ϊʵ������������static��
	public void shopping(){
		//�����ڹ���ʱ��������ڹ���
		//�����������
		System.out.println(name +"�ڹ���");//һ��ʡ�Եķ�ʽ
		//����д��
		//System.out.println(����.name +"�ڹ���");
		System.out.println(this.name +"�ڹ���");//������д��
	}
	
	//��static
	public static void doSome(){
		//ִ�й�����û�е�ǰ���󣬴���static���εķ���ͨ����������
		//����˵������û�е�ǰ����
		//System.out.println(name);����
	}
	public static void doOther(){
		//�����name
		//1.��������
		Customer c=new Customer();
		System.out.println(c.name);//���ʵĲ��ǵ�ǰ�����name
		
	}
}
