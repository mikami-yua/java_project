/*
	java中的package和import机制
		-使用package
			package是包机制，方便程序管理，不同功能的类放在不同的包下

		-package后加包名，只能出现在Java代码的第一行

		-命名规范
			采用公司域名倒叙+项目名+模块名+功能名
		-编译和运行
			-类名不在是HelloWorld 是com.bj.javase.part9.HelloWorld

			-编译：javac -d . HelloWorld.java

			-运行：java com.bj.javase.part9.HelloWorld

		-import机制
			-不在同一个包下需要使用
			-import只能出现在package之下，class之上
			-java.lang包下的不需要导入
*/
package com.bj.javase.part9;

public class HelloWorld
{
	public static void main(String[] args){
		System.out.println("Hello world");
	}
}