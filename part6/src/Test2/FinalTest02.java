package Test2;

public class FinalTest02 {
	
	public static void main(String[] args) {
		User u = new User(100);
		
		//程序执行到此，上面的对象已成为代回收的垃圾
		u = new User(200);
		
		final User user = new User(30);
		
		user.id=50;//final修饰的引用指向的对象不能指向其他对象，但是该对象内部的内存可以修改
		
	}

}
