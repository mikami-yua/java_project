/*
	����return

	����ֵ��voidʱʹ��return
		Ϊ�˽�����ǰ������ִ��
*/
public class MethodTest07
{
	public static void main(String[] args){
		System.out.println(divide(10,3));
		m();
	}
	//��������int���ݵ���,������
	public static int divide(int a,int b){
		return a/b;
	}

	public static void m(){
		//return 10;����: �����ݵ�����: ����ķ���ֵ
		//return;//����
		for(int i=0;i<10;i++){
			if(i==5){
				return;
			}
			System.out.println(i);
		}
		System.out.println("aaaaaaa");
	}
}