/*
	�̳к�ʵ��ͬʱ����
		extends��ǰimplements�ں�
*/
public class Test04
{
	public static void main(String[] args){
		Flyable f =new Cat();//��̬
		f.fly();
	}
}

class Animal
{
}
//�ܲ�εľ��ǽӿ�
//�ӿ�ͨ����ǰ����
interface Flyable
{
	void fly();
}

class Cat extends Animal implements Flyable
{
	public void fly(){
		System.out.println("cat is flying");
	}
}