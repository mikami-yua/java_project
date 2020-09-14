public class OOTest05
{
	public static void main(String[] args){
		Customer c=new Customer();
		System.out.println(c.id);
		c=null;//c被垃圾回收
		//可以通过编译，符合语法
		//运行出现空指针异常
		//空引用访问实例相关的数据异常
		//java.lang.NullPointerException
		System.out.println(c.id);

	}
}