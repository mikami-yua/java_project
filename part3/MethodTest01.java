/*
	����ĸ���
	-invoke ����
	-ĳ�����ܴ���ֻ��Ҫдһ��
	-�����ı��ʾ���һ�ζ����Ĵ���Ƭ�Σ��ҿ������ĳ���ض��Ĺ���

	-����������������
	-������д��˳��û���Ⱥ�˳��
	-�������в����ٶ��巽��
	-�������еĴ����������϶��µ�˳��ִ��
*/
public class MethodTest01
{
	public static void main(String[] args){
		//����1
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);

		//����2
		int m=66;
		int n=88;
		int k=m+n;
		System.out.println(m+"+"+n+"="+k);
		//��������������ʵ��һ������

		MethodTest01.sumInt(a,b);
	}

	//��������һ���������÷��������͹���
	public static void sumInt(int a,int b){
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}
}