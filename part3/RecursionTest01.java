/*
	�����ĵݹ����
	-���������������
	-�ݹ�ܺķ��ڴ�
		���Բ��þ�������
	-���³������ִ���  java.lang.StackOverflowError
		ջ�ڴ��������
		�����޷����
		ֻ��jvmֹͣ����
	-�ݹ�����н�������������һ���ᷢ��ջ�������
	-��ʹ�н�������Ҳ�����
		�ݹ��̫����
	-������ʹ�õݹ飬����Щ�������ʹ�õݹ�-------Ŀ¼����
*/
public class RecursionTest01
{
	public static void main(String[] args){
		doSome();
	}

	//����Ƭ����Ȼֻ��һ�ݣ����ǿɱ��ظ����á�ֻҪ���þͻ����ڴ����·�����һ���������ڴ�ռ�
	public static void doSome(){
		//System.out.println("doSome");
		doSome();
	}
}