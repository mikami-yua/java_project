//顾客
public class Customer
{
	//顾客手里有菜单
	//凡是能用has a 来描述的，统一以属性的方式存在
	//凡是能用is a来描述的，都可以用继承来描述
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

	//点菜
	public void order(){
		//先拿菜单
		foodMenu.xihongshijidan();
		foodMenu.yuxingrousi();
	}
}