public class ForTest02
{
	public static void main(String[] args){
		//���1-10������
		for(int i=1;i<=10;i+=2){
			System.out.println("i------>"+i);
		}
		

		//ѭ�����ж�Ƕ��
		//�ҳ�1-100����������
		//����1  ��1��ʼÿ�ε���2
		for(int i=1;i<=100;i+=2){
			System.out.println("����===��"+i);

		}
		//����2  ��1��ʼÿ�ε���1��ÿ�����ж��Ƿ�������
		for(int i=1;i<=100;i++){
			//�ж�i�Ƿ�Ϊ����
			if(i%2!=0){
				System.out.println("����===��"+i);
			}
		}
		//��һ�ַ���Ч�ʸ�
	
	
	}
}