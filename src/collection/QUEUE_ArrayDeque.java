package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class QUEUE_ArrayDeque {
	public static void main(String[] args) {
		Deque<String> ad = new ArrayDeque<>();
		ad.add("ravi");
		ad.add("ravin");
		ad.add("ravi1");
		// Traversing elements
		for (String str : ad) {
			System.out.println(str);
		}

	}
}
