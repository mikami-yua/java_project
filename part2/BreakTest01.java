/*
	break
	-java�з���Ϊ�ж�

	-break+;���Գ�Ϊ������java���
	
	-������switch ѭ�� ����ֹ

	-ѭ��ִ�е�ĳ������ʱ��ֹѭ��

	-��forΪ��

	-Ĭ�������break�жϵ������������ѭ�����,Ҳ����ָ���ж�ѭ������Ҫ��ѭ������
*/
public class BreakTest01
{
	public static void main(String[] args){
		
		for(int i=0;i<10;i++){
			if(i==5){
				break;
			}
			System.out.println(i);
		}
		System.out.println("helloworld");

		for(int j=0;j<3;j++){
			for(int i=0;i<10;i++){
				if(i==5){
					break;//��ǰbreak��ֹ���ڲ�for
				}
				System.out.println("i===>"+i);
			}
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		//break��ֹ���ѭ��
		for1:for(int j=0;j<3;j++){
			for2:for(int i=0;i<10;i++){
				if(i==5){
					break for1;//��ǰbreak��ֹ��for1
				}
				System.out.println("i===>"+i);
			}
		}
	
	}
}