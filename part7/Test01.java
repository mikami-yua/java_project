/*
	关于java的包机制：
		-包称为package，为了方便管理，不同功能的类被放在不同的软件包中，易于维护
		
		-定义package
			-java源文件第一行编写package
			-package只能编写一个语句
			-语法结构：
				package 包名；

		-包名的命名规范：
			公司域名倒序+项目名+模块名+功能名；
			采用这种方式重名的几率较低
			org.apache.tomcat.core;
		
		-包名要求全部小写

		-一个包对应的是一个目录

		-使用的package之后的编译和运行
			-使用之后，类名不再是Test01 而是part6.Test01
			-编译：javac java源文件路径（生成一个class文件）
			-手动穿件文件夹，，将class字节码文件放到指定目录下
			-运行：java part6.Test01

		-速度比较快的
			编译＋运行
			

*/
package part6;

public class Test01
{
	public static void main(String[] args){
		System.out.println("test01-----main");
	}
}