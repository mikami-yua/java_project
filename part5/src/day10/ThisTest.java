package day10;
//p139= 0.30
/**
 * �ڴ���static�ؼ��ֵķ����в���ֱ�ӷ���ʵ��������ʵ������
 * ��Ϊʵ������ʵ����������Ҫ����Ĵ���
 * static��û��this
 */
public class ThisTest {

	public static void main(String[] args) {
		ThisTest.doSome();
		doSome();
		
		//doOther();����ʵ������һ��������.
		//this.doOther();����main����û��this
		ThisTest tt= new ThisTest();
		tt.doOther();
		

	}
	
	//����static
	public static void doSome(){
		System.out.println("dosome");
	}
	//ʵ������
	public void doOther(){
		//this��ʾ��ǰ����
		System.out.println("doother");
	}
	public void run(){
		//����run����һ�����ж�����ڵ�
		//��{}��һ���Ǵ��ڵ�ǰ����ģ�����this��
		System.out.println("run");
		
		//���õ�ǰ�����doOther
		doOther();
	}
	

}
