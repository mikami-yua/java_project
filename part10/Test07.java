/*
hashcode����
	-Դ��
		public native int hashcode
	
	-����hashֵ��java������ڴ��ַ������hash�õ���ֵ
		ִ�н����ͬ�ڶ�����ڴ��ַ

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