/*
	关于Object类中的finalize方法
		-源代码
			protected void finalize() throws Throwable { }

			GC负责调用

		-finalize没有方法体

		-不需要手动调用，jvm垃圾回收器自动调用

		-finalize的执行时机
			当一个java对象即将被垃圾回收器回收时，垃圾回收器负责调用finalize方法

		-finalize实际是为开发者准备的一个时机，一个垃圾销毁时机
			如果希望对象被销毁时，执行一段代码，这段代码写到finalize中

		-静态代码块
			static{

				。。。
			}
			在类加载的时候执行，且只执行一次

		-java中的垃圾回收器不会轻易启动
			垃圾少，时间没到，都有可能不启动
			
*/
public class Test06
{
	public static void main(String[] args){
		Person p = new Person();

		//垃圾回收器负责调用p.finalize
		//怎么变成垃圾
		p = null;//未启动垃圾回收

		/*
		//多造垃圾
		for (int i=0; i<100000000 ; i++ )
		{
			Person p1 = new Person();
			p1 = null;
		}
		*/

		//建议垃圾回收器启动
		Person p1 = new Person();
		p1 = null;
		System.gc();//可能不启动   Person@25d02c7d即将被销毁
	}
}

class Person
{
	//重写finalize
	protected void finalize() throws Throwable { 
		System.out.println(this + "即将被销毁");
	}

}