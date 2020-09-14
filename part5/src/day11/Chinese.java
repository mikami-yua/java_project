package day11;
/**
 * 变量声明为静态的
 * 		所有对象都有这个属性，不同对象的具体值相同，静态化节省内存开销
 * 变量声明为实例的
 *		所有对象都有这个属性，不同对象的具体值不同
 */
public class Chinese {
	
	String id;
	String name;
	//国籍一定是中国，和上面的实例变量不同
	//String country;浪费内存
	//国籍属于类级别的特征，可以提升为整个模板的特征，在变量前加static关键字
	//静态变量在类加载时就初始化，不需要创建对象内存就开辟了
	//静态变量存储在方法区内存中
	static String country="china";
	
	public Chinese() {
		
	}
	public Chinese(String id, String name) {

		this.id = id;
		this.name = name;
	}
		
		
}
