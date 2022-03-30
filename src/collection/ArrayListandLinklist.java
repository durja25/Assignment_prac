package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListandLinklist {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();// creating arraylist
		al.add("Ravi");// adding object in arraylist
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		List<String> ll2 = new LinkedList<String>();// creating linkedlist
		ll2.add("James");// adding object in linkedlist
		ll2.add("Serena");
		ll2.add("Swati");
		ll2.add("Junaid");

		System.out.println("arraylist: " + al);
		System.out.println("linkedlist: " + ll2);
	}
}
