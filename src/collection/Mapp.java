package collection;

import java.util.HashMap;
import java.util.Map;

public class Mapp {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		System.out.println(map);
		map.remove(102);
		System.out.println(map);
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
