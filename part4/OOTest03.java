/*
	p115
*/

public class OOTest03
{
	public static void main(String[] args){
		User u=new User();
		Address a=new Address();
		u.addr=a;
		System.out.println(u.addr.city);//null
		a.city="tainjin";
		System.out.println(u.addr.city);//tianjin

	}
}