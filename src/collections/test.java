package collections;


import java.util.ArrayList;
import java.util.Collections;

public class test {
	public static void main(String[] args) {
		ArrayList<Stud> n = new ArrayList<>();
		n.add(new Stud(101, "vnem", 23));
		n.add(new Stud(106, "anedfm", 27));
		n.add(new Stud(103, "jnsem", 22));

		Collections.sort(n);
		for (Stud st : n) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
