package collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_retainall {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("name1");
		al.add("n");
		al.add("na");
		al.add("nam");

		ArrayList<String> all = new ArrayList<>();
		all.add("n");
		all.add("na");
		
		//only keeps alls elements in both
		al.retainAll(all);
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
