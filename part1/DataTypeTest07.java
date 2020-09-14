/*
	布尔型

	只有两个值 ：true,false
		不像c语言中，0/1可以表示假和真

	使用在逻辑运算和条件控制语句中

*/
public class DataTypeTest07
{
	public static void main(String[] args){
		
		//boolean flag=1;//类型不兼容
		boolean loginSuccess = true;

		if(loginSuccess){
			System.out.println("登录成功");
		}else{
			System.out.println("用户名不存在");
		}
	}
}