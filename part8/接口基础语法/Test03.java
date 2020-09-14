/*
	一个类可以实现多个接口吗？
		可以【******】弥补了Java中类和类只能单继承的缺陷
	
	之前的结论：
		无论向上转型还是向下转型，两种类型之间必须有继承关系，没有继承关系编译器会报错（不适应在接口）
		最终和实际一样，需要加：instanceof运算符进行判断
		向下转型养成好习惯使用
			if(m instanceof K)判断
*/
public class Test03
{
	public static void main(String[] args){
		//多态
		A a=new D();
		//a.m2();编译报错，A接口中没有m2（）
		B b=new D();
		C c=new D();
		//调用其他接口中的方法需要接口转型
		//a.m2();不行
		B b2=(B)a;
		b2.m2();//编译运行没问题
		
		//向下转型
		D d =(D)a;
		d.m2();
//————————————————————————————————————————————————————
		M m=new E();
		//经过测试，接口和接口之间进行强制类型转换的时候没有类型关系，也可以强转
		//但运行时可能出现ClassCastException
		//K k=(K)m;//编译没问题，运行有问题
		if(m instanceof K){
			K k=(K)m;
		}
	}
}
interface K
{
}

interface M
{
}

class E implements M
{
}

//__________________________________________________________________________________________
interface A
{
	void m1();
}
interface B
{
	void m2();
}
interface C
{
	void m3();
}

class D implements A,B,C
{
	public void m1(){
	
	}

	public void m2(){
		System.out.println("m2......");
	}

	public void m3(){
	
	}
}