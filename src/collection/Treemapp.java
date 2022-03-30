package collection;

import java.util.Map;
import java.util.TreeMap;

public class Treemapp {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(100, "Amit");
		tm.put(102, "Ravi");
		tm.put(101, "Vijay");
		tm.put(103, "Rahul");
		for (Map.Entry m : tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
