public class MethodTest04
{
	public static void main(String[] args){
		//MethodTest04.sum();//����: ʵ�ʲ����б����ʽ�����б��Ȳ�ͬ;
		//MethodTest04.sum(true,false);//�����ݵ�����: boolean�޷�ת��Ϊlong
		MethodTest04.sum(10L,20L);//����
		MethodTest04.sum(10,20);//���ԣ��Զ�����ת��
		//MethodTest04.sum(10.0,20.0);// ������ƥ��; ��doubleת����long���ܻ�����ʧ
	}

	public static void sum(long a,long b){
		System.out.println(a+b);
	}
}