/*
	关于Java中的变量
		
		作用域
			-变量的有效范围
*/
public class VarTest03
{	
	//static不能去掉
	static int k=90;

	public static void main(String[] args){
		int i=100;
		
		for(int a=0;a<10;a++){
		
		}//for结束后a的内存空间被释放

		//System.out.println(a);//无法访问a变量
		
		int j;
		for(j=0;j<10;j++){
		}
		System.out.println(j);//可以访问j变量


	}

	public static void doSome(){

		//这里不能访问main中的i
		System.out.println(k);
	}
}