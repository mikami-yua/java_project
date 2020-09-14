/*
	循环嵌套
	输出99乘法表
*/
public class ForTest04
{
	public static void main(String[] args){

		for(int i=1;i<=9;i++){//外层循环9次，i是行号


			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
				
			}
			System.out.println();


		}

	}
}