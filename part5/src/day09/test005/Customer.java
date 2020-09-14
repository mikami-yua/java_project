package day09.test005;

public class Customer {
	private int no;
	private String name;
	private String birth;
	
	//constructor
	public Customer(int no, String name, String birth) {
		super();
		this.no = no;
		this.name = name;
		this.birth = birth;
	}
	public Customer() {
		super();
	}
	
	//set and get
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	

}
