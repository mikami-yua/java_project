/*
	continue
	-��ʾ����
	
	-continue + ; ����Java��䣬��ѭ���п���ѭ����ִ��

	-break��continue������
		-break��ִ����-----------------------------��ֹѭ��
		-continue��ʾֱ�ӽ����´�ѭ��--------------��ֹ����ѭ��

	-continue Ҳ���Դ�ѭ������
*/
public class ContinueTest01
{
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			if(i==5){
				break;
			}
			System.out.println("i======"+i);//0 1 2 3 4 

		}
		System.out.println("+++++++++++++++++++++++++++++");

		for(int i=0;i<10;i++){
			if(i==5){
				continue;
			}
			System.out.println("i======"+i);//0 1 2 3 4 6 7 8 9 

		}

		System.out.println("+++++++++++++++++++++++++++++");

		for1:for(int i=0;i<10;i++){
			if(i==5){
				continue for1;
			}
			System.out.println("i======"+i);//0 1 2 3 4 6 7 8 9 

		}

	}
}