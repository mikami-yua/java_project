public class OOTest02
{
	public static void main(String[] args){
		//创建User对象
		User u= new User();

		System.out.println(u.no);
		System.out.println(u.name);
		System.out.println(u.addr);

		//修改
		u.no=110;
		u.name="jack";
		u.addr=new Address();

		//main方法当前只能看到一个引用u
		//一切都只能通过u来进行访问
		System.out.println(u.name+"住在哪个城市"+u.addr.city);

		u.addr.city="北京";
		u.addr.street="朝阳";
		u.addr.zipcode="1111111111";
		System.out.println(u.name+"住在哪个城市"+u.addr.city);
		System.out.println(u.name+"住在哪个街道"+u.addr.street);
		System.out.println(u.name+"邮编"+u.addr.zipcode);

	}
}