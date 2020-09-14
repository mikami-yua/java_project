/*
	关于基本数据类型之间的转换规则
		
		-8种基本数据类型除Boolean之外都可以互相转换
		-小容量向大转换称为自动类型转换
			byte<short<int<long<float<double
				 char
			注：任意浮点型不管占用多少字节都比整数类型大
			char和short表示的数量相同，但是char可以取更大的正整数

		-大容量转小容量叫强制类型转换，可能会损失精度
		-当整数字面值没有超出byte,short,char的取值范围，可以直接赋值给byte,short,char类型的变量
		-byte,short,char混合运算时，各自先转换为int类型再运算
		-多种数据类型混合运算，先转换为最大的数据类型再运算
			
			double dd=10/3;
			System.out.println(dd);//结果3.0
				10是int，3也是int先计算后赋值
			double dd=10.0/3;
			System.out.println(dd);//结果3.333333333333333333
				先把3变成3.0再计算

			byte b=3;//正确

			int i=10;
			byte b=i/3;编译报错，int类型4个字节
*/
