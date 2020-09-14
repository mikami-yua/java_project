package part6;

public class Test02
{
	public static void main(String[] args){
		part6.Test01 t =new part6.Test01();
		System.out.println(t);
	
		//可以省略包名，Test01和Test02在同一个目录（软件包中）
		Test01 tt =new Test01();
		System.out.println(tt);
	}
}