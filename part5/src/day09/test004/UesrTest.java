package day09.test004;

public class UesrTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user=new User();
		
		//user.age;����age���ܷ���
		//age�ⲿ���׷��ʲ�����
		//�޸�
		user.setAge(-100);
		//��ȡ
		System.out.println(user.getAge());
		
	}

}
