/*
hashcode方法
	-源码
		public native int hashcode
	
	-返回hash值，java对象的内存地址，经过hash得到的值
		执行结果等同于对象的内存地址

*/
public class Test07
{
	public static void main(String[] args){
		Object obj1=new Object();
		int value1=obj1.hashCode();
		System.out.println(value1);//366712642
		Object obj2=new Object();
		int value2=obj2.hashCode();
		System.out.println(value2);//1829164700
	}
}