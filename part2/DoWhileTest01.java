/*
	do...while
	-�﷨�ṹ
		do{
			ѭ����;
		}while(�������ʽ)��
	-ԭ��
	-ѭ������
		ѭ����ִ�д���1-N
		����ִ��һ��
	-ע������
		while����;
*/
public class DoWhileTest01
{
	public static void main(String[] args){
		int i=10;

		do{
			System.out.println(i);
		}while(i>100);
		
		System.out.println("------------------------------------");

		while(i>100){
			System.out.println(i);
		}

		System.out.println("------------------------------------");

		int j=1;
		do{
			System.out.println(j);
			j++;
		}while(j<=10);

	}
}