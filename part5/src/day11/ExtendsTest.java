package day11;
/**
 * �̳�
 * 		-�����������������֮һ
 * 		-�̳е������Ǵ��븴�ã�����Ҫ�������ǣ������ĸ��ǺͶ�̬
 * 		-�̳��﷨��ʽ
 * 			�����η��б��� class ���� extends ������{
 * 				����=����+����		
 * 			}
 *		-�̳�ֻ֧�ֵ��̳У�һ���಻��ͬʱ�̳кܶ��ֻ࣬�ܼ̳�һ���ࡣ
 *		-�̳��е�����
 *			B��̳�A��
 *				A���Ϊ�����࣬���࣬superclass
 *				B���Ϊ�����࣬�����࣬subclass
 *		-����̳и��࣬�̳е�����
 *			-˽�еĲ�֧�ּ̳�
 *			-���췽����֧�ּ̳�
 *			-���������Լ̳�
 *		-��Ȼֻ֧�ֵ��̳У���Ҳ���Լ�Ӽ̳�������
 *			C extends B{
 *			}
 *			B extends A{
 *			}
 *			A extends T{
 *			}
 *			Cֱ�Ӽ̳�B ��Ӽ̳�T��A
 *		-һ����û����ʾ�ļ̳��κ��࣬����Ĭ�ϼ̳�object��
 */
public class ExtendsTest {

	public static void main(String[] args) {
		
		CreditAccount act=new CreditAccount();
		act.setActno("act-001");
		act.setBalance(-1000);
		act.setCredit(0.99);
		
		System.out.println(act.getActno()+","+act.getBalance()+","+act.getCredit());

	}

}