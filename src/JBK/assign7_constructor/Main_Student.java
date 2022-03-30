package JBK.assign7_constructor;

public class Main_Student {
	public static void main(String[] args) {
		Student obj=new Student();
		System.out.println("student Name is:"+obj.getStuName());
		System.out.println("student age is:"+obj.getStuAge());
		System.out.println("student ID is:"+obj.getStuID());
		
		Student obj2=new Student(555,"name1",25);
		System.out.println("student Name is:"+obj2.getStuName());
		System.out.println("student age is:"+obj2.getStuAge());
		System.out.println("student ID is:"+obj2.getStuID());
		Student obj3=new Student();
		
		obj3.setStuName("name2");
		System.out.println(obj3.getStuName());
		System.out.println(obj3.getStuAge());
		
	}
}
