package day09.test006;
/**
 * �������ݣ������ǲ����ľ���ֵ
 * @author jia
 *
 */
public class Test01 {

	public static void main(String[] args) {
		int i=10;
		add(i);
		System.out.println("main----->"+i);//10

	}
	public static void add(int i){
		i++;
		System.out.println("add----->"+i);//11
		
	}

}
