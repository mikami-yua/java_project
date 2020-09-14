/*
	根据变量的位置分类
		-局部变量
			方法体中声明的变量那个
		-成员变量
			方法体外，类体中声明的变量

		-同一个作用域中变量名不能同名
*/
public class VarTest04
{
	public static void main(String[] args){
		int i=10;//局部变量
	}

	int i=100;//成员变量
	//类体中不能直接写java语句，除了声明变量
	//System.out.println(i)//不合法
	
	public static void doSome(){
		int i=90;
	}

}