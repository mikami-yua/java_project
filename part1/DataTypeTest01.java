/*
	关于java中的数据类型
		
		-数据类型的作用
			指导jvm在运行java程序时分配多大的内存空间

		-Java中的数据类型包括两种
			-基本数据类型
				包括4大类8小种
					第一类：整数型
						byte，short,int,long
					第二类：浮点型
						float,double
					第三类：布尔型
						boolean
					第四类：字符型
						char

			-引用数据类型【后话】
				-类
				-接口
				-数组
		
		-字符串不属于基本数据类型，属于引用数据类型

		-八种基本数据类型占用的空间大小
			基本数据类型                占用空间大小【字节】(一个byte等于8个bit)（一个bit就是一个1或者0，即一个二进制位）
			------------------------------------------------
			byte                        1
			short						2
			int							4（32个二进制位）
			long						8
			float						4
			double						8						
			boolean						1
			char						2

		-byte的最大值01111111（127）  最小值11111111（-128）  
			java的数字类型第一位为符号位
	
		-java中使用Unicode编码

		-八种基本数据类型的取值范围
			byte---------------[-128,127]
			short--------------[-32768,32767]

		-默认值
			


*/

public class DataTypeTest01
{

	public static void main(String[] args){
		char c='a';
		System.out.println(c);
		//一个中文占用两个字节，char类型正好
		char x='国';
		System.out.println(x);

	}
}