/*
	方法的递归调用
	-方法自身调用自身
	-递归很耗费内存
		可以不用尽量不用
	-以下程序会出现错误  java.lang.StackOverflowError
		栈内存溢出错误
		错误无法挽回
		只会jvm停止工作
	-递归必须有结束条件，否则一定会发生栈溢出错误
	-即使有结束条件也肯溢出
		递归的太深了
	-尽量不使用递归，但有些情况必须使用递归-------目录拷贝
*/
public class RecursionTest01
{
	public static void main(String[] args){
		doSome();
	}

	//代码片段虽然只有一份，但是可被重复调用。只要调用就会在内存中新分配以一块所属的内存空间
	public static void doSome(){
		//System.out.println("doSome");
		doSome();
	}
}