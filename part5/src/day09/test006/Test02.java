package day09.test006;
/**
 * 
 * 
 *
 */
public class Test02 {

	public static void main(String[] args) {
		User u=new User(20);
		add(u);//����u��add����ʱ��ʵ���ϴ��ݵ���u�����б����ֵ��ֻ�������ֵ��һ���ڴ��ַ
		System.out.println("main----->"+u.age);
	}
	public static void add(User u){
		u.age++;
		System.out.println("add----->"+u.age);//21
	}

}

class User{
	int age;
	public User(int i){
		age=i;
	}
}
