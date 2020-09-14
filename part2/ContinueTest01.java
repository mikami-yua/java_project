/*
	continue
	-表示继续
	
	-continue + ; 构成Java语句，在循环中控制循环的执行

	-break和continue的区别
		-break不执行了-----------------------------终止循环
		-continue表示直接进入下次循环--------------终止本次循环

	-continue 也可以带循环名称
*/
public class ContinueTest01
{
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			if(i==5){
				break;
			}
			System.out.println("i======"+i);//0 1 2 3 4 

		}
		System.out.println("+++++++++++++++++++++++++++++");

		for(int i=0;i<10;i++){
			if(i==5){
				continue;
			}
			System.out.println("i======"+i);//0 1 2 3 4 6 7 8 9 

		}

		System.out.println("+++++++++++++++++++++++++++++");

		for1:for(int i=0;i<10;i++){
			if(i==5){
				continue for1;
			}
			System.out.println("i======"+i);//0 1 2 3 4 6 7 8 9 

		}

	}
}