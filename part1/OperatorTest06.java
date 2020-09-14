/*
	三元运算符
		-语法规则
			布尔表达式?表达式1：表达式2
		-执行原理
			布尔为真 选择表达式1作为整个表达式的执行结果
			布尔为假 选择表达式2作为整个表达式的执行结果

*/
public class OperatorTest06
{
	public static void main(String[] args){
		boolean sex= false;
		//sex? '男':'女';//错误: 不是语句
		char c=sex? '男':'女';
		System.out.println(c);

		//char c1=sex? "男":'女';//错误: 不兼容的类型: 条件表达式中的类型错误 结果可能是string
		
		
		System.out.println(sex? "男":'女');//可行

	
	}
}