package day10;
/**
 * ����static�ķ����ȿ��Բ��������ķ�ʽ���ʣ�Ҳ���Բ������õķ�ʽ����
 * ��ʹ�������õķ�ʽ���ʣ�ʵ��ִ�е�ʱ���ָ���Ķ���Ҳ�޹�
 * 
 *
 */
public class Test {
	int i=10;
	public static void method1(){
		//����do some
		//������ʽ���ã�ʡ�Է�ʽ����
		Test.doSome();
		doSome();
		
		//����do other
		//������ʽ���ã�ʡ�Է�ʽ����--------û��ʡ�Եķ���
		Test tt= new Test();
		tt.doOther();
		
		//����i
		//������ʽ
		System.out.println(tt.i);
		//ʡ�Է�ʽ��
	}
	public void method2(){
		//����do some
		//������ʽ���ã�ʡ�Է�ʽ����
		Test.doSome();
		doSome();
		//����do other
		//������ʽ���ã�ʡ�Է�ʽ����
		this.doOther();
		doOther();
		//����i
		//������ʽ
		System.out.println(this.i);
		//ʡ�Է�ʽ
		System.out.println(i);
		
	}
	public static void main(String[] args) {
		//����method1-----��static
		//������ʽ����
		Test.method1();
		//ʡ�Է�ʽ����
		method1();
		
		
		//����method2-----����static
		//������ʽ����
		Test tt= new Test();
		tt.method2();
		//ʡ�Է�ʽ����
		//method2();��������static����ʹ��ʡ�Է���

	}
	
	
	public static void doSome(){
		System.out.println("do some");
	}
	public void doOther(){
		System.out.println("do other");
	}

}
