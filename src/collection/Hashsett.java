package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsett {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		// set
		// no duplicate allowed only unique 
		// no order
		// null value is allowed only once 
		hs.add("Ravi");
		hs.add("Vijay");
		hs.add("Ravi");
		hs.add("Ajay");
		hs.add(null);
		hs.add(null);

		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
