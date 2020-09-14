/*
	深入return

	返回值是void时使用return
		为了结束当前方法的执行
*/
public class MethodTest07
{
	public static void main(String[] args){
		System.out.println(divide(10,3));
		m();
	}
	//计算两个int数据的商,并返回
	public static int divide(int a,int b){
		return a/b;
	}

	public static void m(){
		//return 10;错误: 不兼容的类型: 意外的返回值
		//return;//可以
		for(int i=0;i<10;i++){
			if(i==5){
				return;
			}
			System.out.println(i);
		}
		System.out.println("aaaaaaa");
	}
}