package day09.test005;

public class User {
	//�޲ε�
	public User(){
		System.out.println("�޲εĹ��췽��");
	}
	
	//�вε�
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
