public class OOTest05
{
	public static void main(String[] args){
		Customer c=new Customer();
		System.out.println(c.id);
		c=null;//c����������
		//����ͨ�����룬�����﷨
		//���г��ֿ�ָ���쳣
		//�����÷���ʵ����ص������쳣
		//java.lang.NullPointerException
		System.out.println(c.id);

	}
}