public class MethodTest04
{
	public static void main(String[] args){
		//MethodTest04.sum();//错误: 实际参数列表和形式参数列表长度不同;
		//MethodTest04.sum(true,false);//不兼容的类型: boolean无法转换为long
		MethodTest04.sum(10L,20L);//可以
		MethodTest04.sum(10,20);//可以，自动类型转换
		//MethodTest04.sum(10.0,20.0);// 参数不匹配; 从double转换到long可能会有损失
	}

	public static void sum(long a,long b){
		System.out.println(a+b);
	}
}