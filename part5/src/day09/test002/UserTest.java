package day09.test002;
/*
 对当前程序来说，user中的age属性在外部可以随意访问，导致age的不安全
 用户的年龄不可能为负数，程序运行时并没有报错
 
 当前主要讲解封装的好处（三大特征：封装，继承，多态）
 	-封装后，对于事物来说，复杂性封装对外提供简单的操作入口
 	-封装之后才会形成真正的独立体，真正的对象
 	-封装意味着以后的程序可以重复使用，且适应性强
 	-封装对事物本身提高了安全性
 	
 */
public class UserTest {
	public static void main(String[] args) {
		// 创建user对象

		User user = new User();
		System.out.println("该用户年龄： " + user.age);
		user.age = 20;
		System.out.println("该用户的年龄： " + user.age);
		//age属性完全暴露，导致user中部分数据不安全，建议封装
		//不能随意访问属性
		user.age=-100;
		System.out.println("该用户的年龄： " + user.age);
		
	}
}
