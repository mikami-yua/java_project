package day09.test006;
/**
 * 
 * 
 *
 */
public class Test02 {

	public static void main(String[] args) {
		User u=new User(20);
		add(u);//传递u给add方法时，实际上传递的是u变量中保存的值，只不过这个值是一个内存地址
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
