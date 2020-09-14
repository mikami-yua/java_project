package day10;
/**
 *this用来区分局部变量和实例变量时不能省略
 *
 */
public class Uesr {
	private int id;
	private String name;
	
	
	public Uesr(int id) {
		super();
		this.id = id;
	}
	public Uesr(String name) {
		super();
		this.name = name;
	}
	public Uesr() {
		super();
	}
	public Uesr(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
