//�ӿڵ����þ��ǽ����
public class Test
{
	public static void main(String[] args){
		//������ʦ
		FoodMenu cooker1=new AmericanCooker();
		//�����˿�
		Customer customer=new Customer(cooker1);
		//���
		customer.order();
	}
}