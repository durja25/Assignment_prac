package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSettt {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		// set
		// no duplicate allowed only unique
		// no order
		// null value is allowed only once
		ts.add("Ravi");
		ts.add("Vijay");
		ts.add("Ravi");
		ts.add("Ajay");

		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
