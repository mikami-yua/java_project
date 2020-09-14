/*
	接受键盘输入

	键盘到内存
*/
public class KeyInputTest
{
	public static void main(String[] args){
		//1.创建键盘扫描器对象
		java.util.Scanner s=new java.util.Scanner(System.in);
		//2.调用Scanner对象的next（）方法开始接受用户的键盘输入
		//程序执行到这里会停下来等待用户的输入
		//当用户输入的时候，并最终敲回车的时候，信息会被自动赋值给userInputContent
		//【以字符串的形式接收文本】
		String userInputContent = s.next();
		
		//以整数的形式接收数字
		int num=s.nextInt();


		//用户输入的信息已经到内存了
		
		//将内存中的输出到控制台
		System.out.println("您输入了： "+userInputContent);
		System.out.println("您输入了： "+num);
	}
}