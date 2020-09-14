/*
	Object类中的toString方法
		1.源代码
			public String toString(){
				return getClass().getName() + '@' + Integer.toHexString(hashCode())；
			}
			源代码上toString()方法的默认实现是：
				类名@对象的内存地址转换为16进制的形式
		
		2.设计toString()的目的
			通过调用这个方法可以将一个Java对象转换成字符串表示形式

		3.SUN建议所有子类都重写toString()，结果应该是一个简明扼要的表达，容易让人阅读
*/
public class Test01
{
	public static void main(String[] args){
		MyTime t1=new MyTime(1970,1,1);
		String s1=t1.toString();
		//重写toString之前：MyTime@15db9742   之后：1970年1月1日
		System.out.println(s1);
		//注意：输出引用时，会自动调用该引用的toString()
		System.out.println(t1);
	}
}

class MyTime
{
	int year;
	int month;
	int day;
	public MyTime(){
	}
	public MyTime(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}

	//重写tostring，使得结果应该是一个简明扼要的表达，容易让人阅读
	//应越简洁越好，可读性越强越好
	public String toString(){
		return this.year+"年"+this.month+"月"+this.day+"日";
	}
}