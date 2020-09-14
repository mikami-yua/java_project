package com;

import com.bj.javase.part9.HelloWorld;

public class Test02
{
	public static void main(String[] args){
		//创建helloworld对象
		com.bj.javase.part9.HelloWorld hw=new com.bj.javase.part9.HelloWorld();
		System.out.println(hw);//com.bj.javase.part9.HelloWorld@15db9742

		//包名省略 不在同一个包下不能省
		//HelloWorld hw1=new HelloWorld();错误: 找不到符号 HelloWorld hw1=new HelloWorld();
		//System.out.println(hw1);

		HelloWorld hw1=new HelloWorld();
		System.out.println(hw1);
	}
}