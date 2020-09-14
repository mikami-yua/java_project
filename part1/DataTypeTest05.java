/*
	java中的整数型
*/
public class DataTypeTest05
{
	public static void main(String[] args){
		

		long x=100L;
		//x变量long类型8字节
		//y是int，4字节
		//int y=x;//错误: 不兼容的类型: 从long转换到int可能会有损失
		//大容量不能直接赋值给小容量，需要强制类型转化
		//强制类型转换编译通过，运行阶段可能损失精度
		//谨慎使用
		//强制类型转换 保留后面的字节
		int y=(int)x;
		System.out.println(y);


		long k=2147483648L;
		int e=(int)k;
		System.out.println(e);//-2147483648

		//byte只要不超过128可以这么写
		byte b=50;

		byte b1=(byte)128;//-128
	}
}