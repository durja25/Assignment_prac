package collection;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class InkedHMap {
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> tm = new LinkedHashMap<Integer, String>();
		tm.put(100, "Amit");
		tm.put(102, "Ravi");
		tm.put(101, "Vijay");
		tm.put(103, "Rahul");
		for (Map.Entry m : tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("------------------");
		// Hashtable
		Hashtable<Integer, String> tm1 = new Hashtable<Integer, String>();
		tm1.put(100, "Amit");
		tm1.put(102, "Ravi");
		tm1.put(101, "Vijay");
		tm1.put(103, "Rahul");
		for (Map.Entry m : tm1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}
}
