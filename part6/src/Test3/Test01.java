package Test3;
/**
 *访问控制修饰符：
 *	-控制元素的访问范围
 *	-包括
 *		public-------任何位置都能访问
 *		protected----同包，子类		
 *		缺省----------同包
 *		private------只有本类中能访问
 *	-修饰类，变量，方法
 *	-某个数据只希望子类使用，protected修饰
 *
 */
public class Test01 {

	public static void main(String[] args) {
		User u=new User();
		System.out.println(u.i);
		System.out.println(u.j);

	}

}
