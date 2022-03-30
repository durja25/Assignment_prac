package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashsett {
	public static void main(String[] args) {
		LinkedHashSet<String> ll = new LinkedHashSet<String>();
		// set
		// no duplicate allowed only unique
		// no order
		// null value is allowed only once
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ravi");
		ll.add("Ajay");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
