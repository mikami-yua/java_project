/*
	Object���е�equals����
		-Դ����
			public boolean equals(Object obj){
				return ��this==obj����
			}//Ĭ��ʹ��==�ж�

		-Ŀ�ģ�
			ͨ��equals�����ж����������Ƿ����

		-�о�Ĭ�ϵ�equals�Ƿ���
			�����ã�==�Ƚϵ��Ƕ�����ڴ��ַ

*/

public class Test02
{
	public static void main(String[] args){
		//�жϻ�����������
		int a=100;
		int b=100;
		System.out.println(a==b);//�ж����������Ƿ���Ȳ�����==��==�Ƚϵ��Ƕ�����ڴ��ַ
		//�ж�java����
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

	//��дtostring��ʹ�ý��Ӧ����һ��������Ҫ�ı����������Ķ�
	//ӦԽ���Խ�ã��ɶ���ԽǿԽ��
	public String toString(){
		return this.year+"��"+this.month+"��"+this.day+"��";
	}
	
	/*
	public boolean equals(Object obj){
		return (this==obj);
	}//Ĭ��ʹ��==�ж�
	*/
	public boolean equals(Object obj){
		int year1=this.year;
		int month1=this.month;
		int day1=this.day;

		if(obj instanceof MyTime){//obj��û��year month day
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