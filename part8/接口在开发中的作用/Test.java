//接口的作用就是解耦合
public class Test
{
	public static void main(String[] args){
		//创建厨师
		FoodMenu cooker1=new AmericanCooker();
		//创建顾客
		Customer customer=new Customer(cooker1);
		//点菜
		customer.order();
	}
}