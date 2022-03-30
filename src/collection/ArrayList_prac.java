package collection;
import java.util.ArrayList;
//import java.util.*;
import java.util.Iterator;

public class ArrayList_prac {
	
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		//List
		//can have duplicates
		// it is ordered
		// can have null values
		al.add("name1");
		al.add("n");
		al.add("na");
		al.add("nam");
		al.add(null);
		// using for each
		// for (String s : al) {
		// System.out.println(s);
		// }
		// using iterator
		Iterator<String> iterator = al.iterator();
		while (iterator.hasNext()) {
			// String string = (String) iterator.next();
			// System.out.println(string);
			System.out.println(iterator.next());

		}

	}

}
