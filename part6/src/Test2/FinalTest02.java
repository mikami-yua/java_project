package Test2;

public class FinalTest02 {
	
	public static void main(String[] args) {
		User u = new User(100);
		
		//����ִ�е��ˣ�����Ķ����ѳ�Ϊ�����յ�����
		u = new User(200);
		
		final User user = new User(30);
		
		user.id=50;//final���ε�����ָ��Ķ�����ָ���������󣬵��Ǹö����ڲ����ڴ�����޸�
		
	}

}
