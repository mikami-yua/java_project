public class Test05
{
	public static void main(String[] args){
		User u1 = new User("zhangsan",new Address("bj","www","101"));
		User u2 = new User("zhangsan",new Address("bj","www","101"));
		User u3 = new User("zhangsan",new Address("bj","www","103"));
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u3));
	}
}

class User
{
	String name;
	Address addr;

	public User(){}

	public User(String name,Address addr){
		this.name=name;//并不是赋值，赋内存地址
		this.addr=addr;
	}


	//重写equals
	public boolean equals(Object obj){
		if(obj==null || !(obj instanceof User)) return false;
		if(this == obj) return true;//内存地址相同
		User u = (User)obj;
		if(this.name.equals(u.name) && this.addr.equals(u.addr))
			return true;
		return false;
	}
}

class Address
{
	String city;
	String street;
	String zipcode;

	public Address(){}
	
	public Address(String city,String street,String zipcode){
		this.city=city;
		this.street=street;
		this.zipcode=zipcode;
	}

	//重写equals
	public boolean equals(Object obj){
		if(obj==null || !(obj instanceof Address)) 
			return false;
		if(this == obj) 
			return true;//内存地址相同
		Address addr = (Address)obj;
		if(this.city.equals(addr.city) && this.street.equals(addr.street) && this.zipcode.equals(addr.zipcode))
			return true;
		return false;
	}
}
