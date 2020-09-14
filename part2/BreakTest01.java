/*
	break
	-java中翻译为中断

	-break+;可以成为完整的java语句
	
	-可以在switch 循环 中终止

	-循环执行到某个条件时终止循环

	-以for为例

	-默认情况下break中断的是离他最近的循环语句,也可以指定中断循环，需要给循环起名
*/
public class BreakTest01
{
	public static void main(String[] args){
		
		for(int i=0;i<10;i++){
			if(i==5){
				break;
			}
			System.out.println(i);
		}
		System.out.println("helloworld");

		for(int j=0;j<3;j++){
			for(int i=0;i<10;i++){
				if(i==5){
					break;//当前break终止的内层for
				}
				System.out.println("i===>"+i);
			}
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		//break终止外层循环
		for1:for(int j=0;j<3;j++){
			for2:for(int i=0;i<10;i++){
				if(i==5){
					break for1;//当前break终止的for1
				}
				System.out.println("i===>"+i);
			}
		}
	
	}
}