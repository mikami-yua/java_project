package day11;

public class MainTest {

	//public表示公开的，在任何位置都可以访问
	//static表示静态的，使用类名.的方式即可访问，不需要创建对象，就可以调用main方法
	//void表示不反回值
	//String[] args是main方法的形参列表
	public static void main(String[] args) {
		main(10);

	}
	public static void main(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}

}
