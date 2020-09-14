/*
	字面值://c语言中的常量
	-10
	-100
	-'a'
	-"abc"
	-true
	
	字面值就是数据

	Java语言中所有字符串型字面值需要""
	字符型''

*/
public class ConstTest01
{
	public static void main(String[] args){
		System.out.println("abc");
		System.out.println(10);
		System.out.println(10);//两个10是在不同的内存空间
		System.out.println('a');//单引号只能放单个字符
		System.out.println(true);

	}
} 