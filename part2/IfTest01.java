/*
	if语句，属于选择结果，又被称为分支语句条件控制语句
	
		-语法结构
			1.
				if(布尔表达式){
					java语句；
					.......
				}
			
			2.
				if(bool){
					java语句；
					......
				}else{
					java语句;
					......
				}

			3.
				if(bool){
					java语句；
				}else if(bool){
					java;
				}else if(bool){
					java;
				}else if(bool){
					java;
				}else if(bool){
					java;
				}.......

			4.
				if(bool){
					java语句；
				}else if(bool){
					java;
				}else if(bool){
					java;
				}else if(bool){
					java;
				}else if(bool){
					java;
				}else{
					java;
				}

*/
public class IfTest01
{
	public static void main(String[] args){
		double distance = 6.0;
		if(distance< 5){
			System.out.println("去kfc");
		}

		int grade=83;

		if(grade<=100 & grade>=90){
			System.out.println("优秀");
		}else if(grade<90 & grade>=80){
			System.out.println("良好");
		}else if(grade<80 & grade>=70){
			System.out.println("中等");
		}else if(grade<70 & grade>=60){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}



	}
}