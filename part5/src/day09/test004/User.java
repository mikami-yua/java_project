package day09.test004;
/**
 * ��װ�Ĳ���
 * @author jia
 * 1.��������˽�л�ʹ��private���Σ����ε�����ֻ���ڱ�����ʹ��
 * 2.������߼򵥵Ĳ������
 * 		-�����ṩ���������ķ�����get��set
 * 3.set�����������淶��
 * 		public static set+����������ĸ��д���βΣ�{
 * 		}
 * 4.get�����������淶��
 * 		public int getAge(){
 * 			return age;
 * 		}
 * 
 * 
 * һ�����Է��ʵ�ʱ��ͨ���ķ�����ʽ�У�
 * 	-��ȡ---get
 * 	-�޸�---set
 * 
 * �ȱ�����������
 * 	-setter and getter����û��static�ؼ���
 * 	-��static�ؼ������εķ���������.��������ʵ�Σ�
 * 	-û��static�ؼ��ֵ����η���������.��������ʵ�Σ�
 */

public class User {
	//����˽�л�
	private int age;
	
	//set����û�з���ֵ��ֻ�����޸�����
	public void setAge(int a){
		//��дҵ���߼����п���
		if(a < 0 || a > 150){
			System.out.println("���䲻�Ϸ�");
			return;
		}
		
		age=a;
	}
	
	//get
	public int getAge(){
		return age;
	}
	
	
	
}
