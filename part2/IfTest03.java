/*
	�жϵ�ǰ��������
		
*/
public class IfTest03
{
	public static void main(String[] args){

		//����Ա� 1 ��  0 Ů
		//1 ���� 0 ����
		java.util.Scanner s=new java.util.Scanner(System.in);

		//�����Ա�
		System.out.print("�������Ա�: ");
		int sex=s.nextInt();
		//��������
		System.out.print("�����뵱ǰ����: ");
		int weather=s.nextInt();
		if(weather==1){
			//����
			System.out.println("����");
			if(sex==1){
				System.out.println("��һ�Ѵ��ɡ");
			}else if(sex==0){
				System.out.println("��һ�Ѵ�ɡ");
			}else{
				System.out.println("�Ա𲻺Ϸ�");
			}
		}else if(weather==0){
			//����
			System.out.println("���죬�������¶�");
			//�����¶�
			int tem=s.nextInt();
			if(tem>30){
				if(sex==1){
					System.out.println("��ī��");
				}else if(sex==0){
					System.out.println("��ɹ˪");
				}else{
					System.out.println("�Ա𲻺Ϸ�");
				}
			}
		}else{
			//���Ϸ�
			System.out.println("�������Ϸ�");
		}

	}
}