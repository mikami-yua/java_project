/*
	java中的转义字符
		\

*/
public class DataTypeTest03
{
	public static void main(String[] args){
		char c1='n';
		System.out.println(c1);
		char c2='\n';//换行符
		//System.out.println(c2);
		System.out.print("Hello");//print输出不换行
		System.out.println(c2);
		System.out.println("World!");



		char c3='\t';//制表符-table
		
		System.out.print("A");
		System.out.print(c3);
		System.out.println("B");


		//输出\
		//char c4='\';\将'转义为了普通的',''少了另一半
		char c4='\\';//第一个反斜杠将后一个反斜杠转义为普通的反斜杠
		System.out.println(c4);

		//输出'
		char c5='\'';
		System.out.println(c5);
		//输出"
		char c6='\"';
		System.out.println(c6);
		char c7='"';
		System.out.println(c7);
		//c6,c7都可以


		//输出带""的helloworld
		System.out.println("\"helloworld\"");

		//jdk中带有的native2ascii.exe可以将文字转换为Unicode编码
		char c8='中';
		System.out.println(c8);
		char c9='\u4e2d';
		System.out.println(c9);
		char c10='\u0000';//空
		System.out.println(c10);
	}
}