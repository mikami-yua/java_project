package com;

import com.bj.javase.part9.HelloWorld;

public class Test02
{
	public static void main(String[] args){
		//����helloworld����
		com.bj.javase.part9.HelloWorld hw=new com.bj.javase.part9.HelloWorld();
		System.out.println(hw);//com.bj.javase.part9.HelloWorld@15db9742

		//����ʡ�� ����ͬһ�����²���ʡ
		//HelloWorld hw1=new HelloWorld();����: �Ҳ������� HelloWorld hw1=new HelloWorld();
		//System.out.println(hw1);

		HelloWorld hw1=new HelloWorld();
		System.out.println(hw1);
	}
}