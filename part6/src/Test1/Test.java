package Test1;
/**
 * ��̬��ʵ�ʿ����е����ã�����������ι����Ϊ��
 * 	-���������͵ĳ���
 * 		-���ˡ��ࡿ
 * 			-ι����������
 * 		-����ࡿ
 * 			-�Զ�����������
 * 
 * ������࣬Ȼ����ʵ����Ϊ���󣬸�һ��������ʹ���ø�������Э�������γ�ϵͳ
 * 
 * ��̬��������
 * 	���ͳ������϶ȣ������չ��
 * 	����������ָ�������Ͷ���
 */
public class Test {

	public static void main(String[] args) {
		
		//��������
		Master zhangsan = new Master();
		//����è
		//Cat tom = new Cat();
		zhangsan.feed(new Cat());
		
		
		//Dog erha = new Dog();
		zhangsan.feed(new Dog());
		
		Snack python = new Snack();
		zhangsan.feed(python);

	}

}
