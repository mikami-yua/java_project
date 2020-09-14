/*
	Object���е�toString����
		1.Դ����
			public String toString(){
				return getClass().getName() + '@' + Integer.toHexString(hashCode())��
			}
			Դ������toString()������Ĭ��ʵ���ǣ�
				����@������ڴ��ַת��Ϊ16���Ƶ���ʽ
		
		2.���toString()��Ŀ��
			ͨ����������������Խ�һ��Java����ת�����ַ�����ʾ��ʽ

		3.SUN�����������඼��дtoString()�����Ӧ����һ��������Ҫ�ı����������Ķ�
*/
public class Test01
{
	public static void main(String[] args){
		MyTime t1=new MyTime(1970,1,1);
		String s1=t1.toString();
		//��дtoString֮ǰ��MyTime@15db9742   ֮��1970��1��1��
		System.out.println(s1);
		//ע�⣺�������ʱ�����Զ����ø����õ�toString()
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

	//��дtostring��ʹ�ý��Ӧ����һ��������Ҫ�ı����������Ķ�
	//ӦԽ���Խ�ã��ɶ���ԽǿԽ��
	public String toString(){
		return this.year+"��"+this.month+"��"+this.day+"��";
	}
}