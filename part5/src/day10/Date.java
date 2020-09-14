package day10;
/**
 * this
 * 		用在实例方法中，代表其他对象
 * 		用在构造方法中，通过当前构造方法调用其他构造方法【只能出现在方法的第一行】
 *
 */
public class Date {
	private int year;
	private int month;
	private int day;
	
	/**
	 * 程序员调用无参时，默认创建1970-1-1
	 */
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//与上面的代码重复了
	public Date() {
		/*
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		*/
		//代码复用，调用另一个构造方法实现,前提是不能创建新对象
		//new Date(1970,1,1);创建新对象了---错误
		this(1970,1,1);//不会创建新的对象也能实现调用其他构造方法的目的
		
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	//对外提供一个方法可以打印输出
	public void print(){
		System.out.println(this.year+"年"+this.month+"月"+this.day+"日");
	}
	
	
}
