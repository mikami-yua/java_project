public class ForTest02
{
	public static void main(String[] args){
		//输出1-10的奇数
		for(int i=1;i<=10;i+=2){
			System.out.println("i------>"+i);
		}
		

		//循环和判断嵌套
		//找出1-100的所有奇数
		//方案1  从1开始每次递增2
		for(int i=1;i<=100;i+=2){
			System.out.println("奇数===》"+i);

		}
		//方案2  从1开始每次递增1，每个数判断是否是奇数
		for(int i=1;i<=100;i++){
			//判断i是否为奇数
			if(i%2!=0){
				System.out.println("奇数===》"+i);
			}
		}
		//第一种方案效率高
	
	
	}
}