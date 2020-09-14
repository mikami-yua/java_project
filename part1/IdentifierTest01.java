/*
关于java语言中的标识符
	1.什么是标识符
		-可以自己命名的都叫标识符
		-editplus中以黑色字体高亮显示
		-可以标识
			类名
			方法名
			接口名
			常量名
			...

	2.标识符的命名规则【是语法】
		-必须有一个合法的数字，字母，下划线，美元符号，构成
		-不能以数字开头
		-严格区分大小写
		-关键字不能当标识符
		-理论上无长度限制

	3.标识符的命名规范
		-最好见名知意
				public class UserService{
					public void login(String username,String password){
						
					}
				}
		-遵守驼峰命名

		-类名，接口名；首字母大写，后面每个单词首字母大写

		-变量名，方法名：首字母小写，后面每个单词首字母大写

		-常量名全部大写

*/
public class IdentifierTest01//IdentifierTest01是一个类名
{
	public static void main(String[] args){//main方法名，args变量名
		
	}
	
	//doSome是一个方法名
	public static void doSome(){
		int i=0;//i是变量名
	
	}
}