package day11;
/**
 * ��̬
 * 		-animal cat brid
 * 			cat��brid֮��û�м̳й�ϵ
 * 		
 * 		-���ڶ�̬�еļ�������
 * 			����ת�ͣ�upcasting  
 * 				������ת��Ϊ�����ͣ��ֳ�Ϊ�Զ�����ת��
 * 			����ת�ͣ�downcasting
 *				������ת��Ϊ�����ͣ��ֳ�Ϊǿ������ת��
 *			����������ת�ͻ�������ת�ͣ���������֮�����Ҫ�м̳й�ϵ
 */
public class Test {

	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.move();
		Cat c1=new Cat();
		c1.move();
		c1.catchMouse();
		Brid b1=new Brid();
		b1.move();
		
		//ʹ�ö�̬
		//new cat()�����Ķ�����cat a2�����������������Animal���ɼ�����������ת��
		//����ת��Ϊ���࣬��Ϊ����ת��-----upcasting
		Animal a2=new Cat();
		/**
		 * ���򶼷�Ϊ����׶κ����н׶�
		 * �ȷ�������׶��ٷ������н׶Σ����벻ͨ���޷�����
		 * ����׶α��������a2���������������Ϊanimal���ֽ�������move�������б���ͨ���ˡ�������̳�Ϊ��̬��
		 * ��̬�󶨳ɹ��˲Ż��к���������
		 * ���н׶Σ�jvm���ڴ�����ʵ�����Ķ�����cat��������move���õ���cat�е�move
		 * ����������ָ�������Ͷ������ֻ��Ƶ��³����ڱ���׶ΰ󶨺����н׶ΰ����ֲ�ͬ����̬״̬-----���ֻ��Ƴ�Ϊ��̬
		 */
		a2.move();
		
		//brid b2=new Cat();���뱨������������֮�䲻���ڼ̳й�ϵ
		/**
		 * ���� �����϶���ִ��catchmouse����
		 * 	a2�޷�֮�����
		 * 	a2ǿ������ת��Ϊcat���ͣ���Ϊdowncasting
		 * 
		 * ����ת��
		 * 	�����õķ����������������еģ��������в����ڣ���������ת��
		 * 
		 * java�淶Ҫ��
		 * 	ǿ������ת��ǰ��ʹ��instanceof��������������
		 */
		Cat c2=(Cat) a2;
		c2.catchMouse();
		
		System.out.println("************************************");
		Animal a3=new Brid();//��̬
		/**
		 * �����޴�����������⵽a3��animal����������ת��
		 * 
		 * ���г�����jvm���ڴ�����ʵ���ڵ���brid����brid�޷�ת��Ϊcat����Ϊ���߲����ڼ̳й�ϵ
		 * 	java.lang.ClassCastException
		 * 	����ת���쳣�������쳣���Ƿ���������ת���쳣
		 */
		//Cat c3=(Cat) a3;
		/**
		 * ����
		 * 		ֻ����ǿ������ת��ʱ����������ת�ʹ�������������ɹ������п��ܴ�
		 * 		����ת��ֻҪ����������в����
		 * 		��������ת�͵�java.lang.ClassCastException����
		 * 			ʹ��instanceof��������Ա���
		 * 		instanceof��ʹ��
		 * 			�﷨
		 * 				(���� instanceof ����������)
		 * 			ִ�н��������Boolean���ͣ����裺��a instanceof Animal��
		 * 				true��
		 * 					��ʾa�������ָ��Ķ�����һ��animal����
		 * 				false��
		 * 					��ʾa�������ָ��Ķ�����һ��animal����
		 */
		//��a3ָ��Ķ���ȷʵ��catʱ��ǿ������ת��
		if(a3 instanceof Cat){
			Cat c3=(Cat) a3;
			c3.catchMouse();
		}else if(a3 instanceof Brid){
			Brid b2=(Brid) a3;
			b2.fly();
		}
		
	}

}