/*
	�����֮���Ǽ̳У���ͽӿ�֮����ʵ��
		�̳�ʹ��extends
		ʵ��ʹ��implements
	
	��*****����һ���ǳ������ʵ�ֽӿ���Ҫ�ѽӿ������г��󷽷���ʵ��



*/
public class Test02
{
	public static void main(String[] args){
		//��̬ �����͵�����ָ�������͵ı���
		MyMath mm=new MyMathImpl();
		
		//���ýӿ���ķ���������ӿڱ�̣�
		int result1=mm.sum(10,20);
		System.out.println(result1);
		int result2=mm.sub(10,20);
		System.out.println(result2);
	}
}

//����ĳ����࣬��ȫ������====�ӿ�
interface MyMath
{	
	double PI=3.1415926;

	int sum(int a,int b);
	int sub(int a,int b);
}
//�࣬�ǳ����࣬��Ҫʵ�ֳ��󷽷�
class MyMathImpl implements MyMath
{
	public int sum(int a,int b){
		return a+b;
	}
	public int sub(int a,int b){
		return a-b;
	}
}