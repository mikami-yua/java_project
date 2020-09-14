package day09.test005;

public class User {
	//无参的
	public User(){
		System.out.println("无参的构造方法");
	}
	
	//有参的
	public User(int i){
		System.out.println(i);
	}
	public User(String name){
		System.out.println(name);
	}
	public User(int i,String name){
		System.out.println(i+" "+name);
	}
}
