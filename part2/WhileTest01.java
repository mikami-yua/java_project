/*
	while
	-语法结构
		while(布尔表达式){
			循环体;
		}

	-执行原理
		先判断布尔表达式，再执行循环体，再判断布尔表达式

	-while的执行次数
		0-N
		循环体执行次数可能为0次
*/
public class WhileTest01
{
	public static void main(String[] args){
		/*
		while(true){
			System.out.println("死循环");
		}
		System.out.println("不会被执行");//错误: 无法访问的语句
		
		*/
		int i=3,j=10;
		while(j>3){
			System.out.println("死循环");
		}
		System.out.println("不会被执行");//没有错误！直接暴露字面值和写变量不同
	}
}