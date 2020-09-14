package com.bj.javase.part9;

public class Test01
{
	public static void main(String[] args){
		//创建helloworld对象
		com.bj.javase.part9.HelloWorld hw=new com.bj.javase.part9.HelloWorld();
		System.out.println(hw);//com.bj.javase.part9.HelloWorld@15db9742

		//包名省略
		HelloWorld hw1=new HelloWorld();
		System.out.println(hw1);
	}
}