/*
	������
		
		-һ���ǳ������̳��˳����࣬����ʵ�ֳ��󷽷��������ס��

		-���Ƿ���û�з�����Ķ��ǳ��󷽷�
			Object���� public native int hashCode();
			�ײ����c++д�Ķ�̬���ӿ�
*/
public class AbstactTest02
{
	public static void main(String[] args){
		//ʹ�ö�̬
		//������ָ��������
		Animal a = new Bird();//���������
		//����ʱmove������animal��
		//����ʱmove������bird��
		a.move();

		//��̬
	}
}

abstract class Animal
{
	//���󷽷�
	public abstract void move();
}

class Bird extends Animal
{
	//��Ҫ��д���󷽷�
	public void move(){
		System.out.println("���ڷ�");
	}
}