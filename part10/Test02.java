/*
	Object类中的equals方法
		-源代码
			public boolean equals(Object obj){
				return （this==obj）；
			}//默认使用==判断

		-目的：
			通过equals方法判断两个对象是否相等

		-研究默认的equals是否够用
			不够用，==比较的是对象的内存地址

*/

public class Test02
{
	public static void main(String[] args){
		//判断基本数据类型
		int a=100;
		int b=100;
		System.out.println(a==b);//判断两个对象是否相等不能用==，==比较的是对象的内存地址
		//判断java对象
		MyTime t1=new MyTime(2008,8,8);
		MyTime t2=new MyTime(2008,8,8);

		System.out.println(t1==t2);//false
		boolean f=t1.equals(t2);
		System.out.println(f);

		MyTime t3=new MyTime(2009,8,8);
		System.out.println(t1.equals(t3));
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
	
	/*
	public boolean equals(Object obj){
		return (this==obj);
	}//默认使用==判断
	*/
	public boolean equals(Object obj){
		int year1=this.year;
		int month1=this.month;
		int day1=this.day;

		if(obj instanceof MyTime){//obj里没有year month day
			MyTime t=(MyTime)obj;
			int year2=t.year;
			int month2=t.month;
			int day2=t.day;
			
			if(year1==year2 && month1==month2 && day1==day2){
				return true;
			}
		}

		return false;
	}
}