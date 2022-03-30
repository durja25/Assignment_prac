package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListtt {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
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
