public class IfTest02
{
	public static void main(String[] args){
		//���ݼ��������ж�����˵����������ĸ��׶�
		
		//1.���ռ�������
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("�������������䣺 ");
		int age=s.nextInt();
		System.out.println("age = "+age);
		//2.�ж�
		String str="����";
		if(age<0 || age>150){
			str="���ṩ�����䲻�Ϸ�";
		}else if(age<=5){
			str="�׶�";
		}else if(age<=10){
			str="����";
		}else if(age<=18){
			str="������";
		}else if(age<=35){
			str="����";
		}else if(age<=55){
			str="����";
		}
		System.out.println("������ "+str);
	
	}
}