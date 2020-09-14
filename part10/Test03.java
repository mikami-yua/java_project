/*
	java中的string有没有重写tostring（）

		-string类重写了equals

		-string类重写了tostring

		Java中什么类型的数据使用==判断---------------基本数据类型
							使用equals（）-----------引用数据类型
*/
public class Test03
{
	public static void main(String[] args){
		//大部分情况下，采用这样的方式创建字符串对象
		String s1="hello";


		//实际上string是个类
		String s2=new String("test1");
		String s3=new String("test2");
		System.out.println(s2==s3);//false s2,s3保存的内存地址不同

		//比较字符串不能用双等号，必须使用equals方法
		System.out.println(s2.equals(s3));//true

		String s4=new String("test3");
		System.out.println(s4.toString());//test3

	}
}