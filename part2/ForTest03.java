/*
	计算1-100所有奇数的和

	+=专门用来累加
*/
public class ForTest03
{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<100;i+=2){
			sum+=i;
		}
		System.out.println(sum);
	}
}