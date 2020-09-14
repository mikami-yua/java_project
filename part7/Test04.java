package org.apache;
/*
	import用于导入其他类
		同一个包下不需要导入

		import 类名；
		import 包名.*;
		
		需要编写在package语句之下

		需要import
			不再Java.lang包下，且不再一个包下，需要import引入
*/
import part6.Test01;

public class Test04
{
	public static void main(String[] args){
		part6.Test01 tt =new part6.Test01();
		System.out.println(tt);

		//以上程序可以，但是麻烦
		Test01 x=new Test01();
		System.out.println(x);

	}
}