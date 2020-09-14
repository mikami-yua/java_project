public class SwitchTest02
{
	public static void main(String[] args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("请输入星期几： ");
		String dayOfWeek=s.next();
		switch(dayOfWeek){
			case"星期一":
				System.out.println(1);
				break;
			default:
				System.out.println("数据非法");
			
		}
	}
}