/*
	判断当前的天气：
		
*/
public class IfTest03
{
	public static void main(String[] args){

		//获得性别 1 男  0 女
		//1 下雨 0 晴天
		java.util.Scanner s=new java.util.Scanner(System.in);

		//接收性别
		System.out.print("请输入性别: ");
		int sex=s.nextInt();
		//接受天气
		System.out.print("请输入当前天气: ");
		int weather=s.nextInt();
		if(weather==1){
			//下雨
			System.out.println("下雨");
			if(sex==1){
				System.out.println("带一把大黑伞");
			}else if(sex==0){
				System.out.println("带一把大花伞");
			}else{
				System.out.println("性别不合法");
			}
		}else if(weather==0){
			//晴天
			System.out.println("晴天，请输入温度");
			//接收温度
			int tem=s.nextInt();
			if(tem>30){
				if(sex==1){
					System.out.println("戴墨镜");
				}else if(sex==0){
					System.out.println("防晒霜");
				}else{
					System.out.println("性别不合法");
				}
			}
		}else{
			//不合法
			System.out.println("天气不合法");
		}

	}
}