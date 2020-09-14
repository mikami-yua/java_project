package day11;

public class ChineseTest {

	public static void main(String[] args) {
		
		Chinese zhangsan=new Chinese("1","zhangsan");
		System.out.println(zhangsan.id+","+zhangsan.name+","+Chinese.country);
		
		Chinese lisi=new Chinese("2","lisi");
		System.out.println(lisi.id+","+lisi.name+","+Chinese.country);
		
		
	}

}
