package collection;
import java.util.ArrayList;
import java.util.Iterator;

class Student {
	String name;
	int id;
	int age;
	
	Student(String name, int id , int age){
		this.name = name;
		this.id = id;
		this.age = age;
	}
}

public class ArrayandObj {
	public static void main(String[] args) {
		Student st = new Student("anem", 1, 14);
		Student st1 = new Student("12anem", 2, 20);
		Student st2 = new Student("23anem", 3, 18);
		ArrayList<Student> al = new ArrayList<Student>() ;
		al.add(st);
		al.add(st1);
		al.add(st2);
		
		Iterator<Student> atr = al.iterator();
		while (atr.hasNext()) {	
			Student stu = atr.next();
			System.out.println(stu.name+" "+stu.id+" "+stu.age);
			
		}
		
		
		
	}

}
