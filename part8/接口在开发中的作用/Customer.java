//�˿�
public class Customer
{
	//�˿������в˵�
	//��������has a �������ģ�ͳһ�����Եķ�ʽ����
	//��������is a�������ģ��������ü̳�������
	private FoodMenu foodMenu;
	
	public Customer(){
	}
	public Customer(FoodMenu foodMenu){
		this.foodMenu=foodMenu;
	}
	
	public void setFoodMenu(FoodMenu foodMenu){
		this.foodMenu=foodMenu;
	}

	public FoodMenu getFoodMenu(){
		return foodMenu;
	}

	//���
	public void order(){
		//���ò˵�
		foodMenu.xihongshijidan();
		foodMenu.yuxingrousi();
	}
}