package day11;
/**
 * ��������Ϊ��̬��
 * 		���ж�����������ԣ���ͬ����ľ���ֵ��ͬ����̬����ʡ�ڴ濪��
 * ��������Ϊʵ����
 *		���ж�����������ԣ���ͬ����ľ���ֵ��ͬ
 */
public class Chinese {
	
	String id;
	String name;
	//����һ�����й����������ʵ��������ͬ
	//String country;�˷��ڴ�
	//���������༶�����������������Ϊ����ģ����������ڱ���ǰ��static�ؼ���
	//��̬�����������ʱ�ͳ�ʼ��������Ҫ���������ڴ�Ϳ�����
	//��̬�����洢�ڷ������ڴ���
	static String country="china";
	
	public Chinese() {
		
	}
	public Chinese(String id, String name) {

		this.id = id;
		this.name = name;
	}
		
		
}
