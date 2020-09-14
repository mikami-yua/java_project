/*
	数据类型的默认值--------一切向0看齐

		成员变量系统会默认赋值，局部变量不会
		数据类型        默认值
		----------------------
		byte			0
		short
		int
		long
		float			0.0
		double
		boolean			false【0】
		char			\u0000

*/
public class DataTypeTest02
{

	static int i;//成员变量
	public static void main(String[] args){
		//int i;//局部变量会报错
		System.out.println(i);

	}
}