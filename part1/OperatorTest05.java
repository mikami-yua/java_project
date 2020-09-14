/*
	java种的‘+’
		-加法运算
			两边都是数字

			多个加号从左到右依次加

		-字符串的连接运算
			只要有一个数据是字符串，就进行字符串连接运算，结果依然是个字符串
*/
public class OperatorTest05
{
	public static void main(String[] args){

		System.out.println(10+20+"30");//第一个加号求和，第二个加号是字符串连接    3030
		System.out.println(10+(20+"30"));//102030
		int a=10;
		int b=20;
		//控制台输出“10+20=30”
		System.out.println(a +"+"+ b+ "="+ (a+b));

		//引用类型string
		int i=10;
		String userName="zhnags";
		System.out.println("登录成功"+userName+"欢迎");
		

	
	}
}