/*
	if��䣬����ѡ�������ֱ���Ϊ��֧��������������
	
		-�﷨�ṹ
			1.
				if(�������ʽ){
					java��䣻
					.......
				}
			
			2.
				if(bool){
					java��䣻
					......
				}else{
					java���;
					......
				}

			3.
				if(bool){
					java��䣻
				}else if(bool){
					java;
				}else if(bool){
					java;
				}else if(bool){
					java;
				}else if(bool){
					java;
				}.......

			4.
				if(bool){
					java��䣻
				}else if(bool){
					java;
				}else if(bool){
					java;
				}else if(bool){
					java;
				}else if(bool){
					java;
				}else{
					java;
				}

*/
public class IfTest01
{
	public static void main(String[] args){
		double distance = 6.0;
		if(distance< 5){
			System.out.println("ȥkfc");
		}

		int grade=83;

		if(grade<=100 & grade>=90){
			System.out.println("����");
		}else if(grade<90 & grade>=80){
			System.out.println("����");
		}else if(grade<80 & grade>=70){
			System.out.println("�е�");
		}else if(grade<70 & grade>=60){
			System.out.println("����");
		}else{
			System.out.println("������");
		}



	}
}