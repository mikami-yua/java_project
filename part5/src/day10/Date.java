package day10;
/**
 * this
 * 		����ʵ�������У�������������
 * 		���ڹ��췽���У�ͨ����ǰ���췽�������������췽����ֻ�ܳ����ڷ����ĵ�һ�С�
 *
 */
public class Date {
	private int year;
	private int month;
	private int day;
	
	/**
	 * ����Ա�����޲�ʱ��Ĭ�ϴ���1970-1-1
	 */
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//������Ĵ����ظ���
	public Date() {
		/*
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		*/
		//���븴�ã�������һ�����췽��ʵ��,ǰ���ǲ��ܴ����¶���
		//new Date(1970,1,1);�����¶�����---����
		this(1970,1,1);//���ᴴ���µĶ���Ҳ��ʵ�ֵ����������췽����Ŀ��
		
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
	
	//�����ṩһ���������Դ�ӡ���
	public void print(){
		System.out.println(this.year+"��"+this.month+"��"+this.day+"��");
	}
	
	
}
