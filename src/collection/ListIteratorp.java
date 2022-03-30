package collection;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorp {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("name1");
		al.add("n");
		al.add("na");
		al.add(1, "nam");

		// System.out.println(al.get(2));

		// al.removeAll(all);
		ListIterator<String> it = al.listIterator();
		
		System.out.println("traversing elements in forward direction...");
		 while(it.hasNext()){
		 System.out.println(it.next());
		 }
		
		System.out.println("traversing elements in backward direction...");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}

	}
}
