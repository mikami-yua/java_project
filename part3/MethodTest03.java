/*
	�����ĵ��ò�һ����main��
	�������ִ�е��Ķ����Ե���

*/


public class  MethodTest03
{	
	public static void sum(int a,int b){
		System.out.println(a+b);
		//����doSome����
		MethodTest03.doSome();
	}

	public static void main(String[] args){
		//����sum����
		MethodTest03.sum(1,2);
		System.out.println("helloworld!");
	}

	public static void doSome(){
		System.out.println("do some!");
	}
}