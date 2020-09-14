/*
	循环
		-三种
		for
		while
		do...while

		-for
			结构
			for(初始化表达式;布尔表达式;更新表达式){
				
			}

			原理：
				for里的三个表达式都不必须的，但是两个;是必须的
				初始化表达式最先执行，且只执行一次
				布尔表达式只能是真或者假

				过程：
					1.先执行初始表达式
					2.判断布尔表达式
						为真
							执行循环体
							执行更新表达式
							2.判断布尔表达式
						为假循环结束

*/
public class ForTest01
{
	public static void main(String[] args){
		//循环结构
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}




	}
}