public class SwitchTest02
{
	public static void main(String[] args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("���������ڼ��� ");
		String dayOfWeek=s.next();
		switch(dayOfWeek){
			case"����һ":
				System.out.println(1);
				break;
			default:
				System.out.println("���ݷǷ�");
			
		}
	}
}