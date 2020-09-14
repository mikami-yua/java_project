public class Test04
{
	public static void main(String[] args){
		Student s1 = new Student(111,"bjdx");
		Student s2 = new Student(111,"bjdx");
		System.out.println(s1==s2);//fasle
		System.out.println(s1.equals(s2));//true
	}

}

class Student
{
	int no;
	String school;

	public Student(){}
	public Student(int no,String school){
		this.no=no;
		this.school=school;
	}
	
	//��дtostring
	public String toString(){
		return "ѧ��"+no+"school"+school;
	}

	//��дequals,��дģʽ�̶�
	public boolean equals(Object obj){
		if(obj==null || !(obj instanceof Student)){
			return false;
		}
		if(this == obj) return true;
		Student s = (Student)obj;		
		if(this.no==s.no && this.school.equals(s.school)) 
			return true;
		
		
		return false;
	}

}