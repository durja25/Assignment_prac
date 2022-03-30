package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QUEUE_PriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<String> p = new PriorityQueue<>();
		// Queue
		// ordered
		// can hv dups

		p.add("Amit");
		p.add("Vijay");
		p.add("Karan");
		p.add("Jai");
		p.add("Rahul");

		System.out.println("head:" + p.element());
		System.out.println("head:" + p.peek());
		System.out.println("iterating the queue elements:");
		Iterator<String> itr = p.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		p.remove();
		p.poll();
		
		System.out.println("after removing two elements:");
		Iterator<String> itr2=p.iterator();
		while(itr2.hasNext()){
		System.out.println(itr2.next());
		}

	}
}
