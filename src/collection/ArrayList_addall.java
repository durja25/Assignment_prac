package collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_addall {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("name1");
	al.add("n");
	al.add("na");
	al.add("nam");	
	
	ArrayList<String> all = new ArrayList<>();
	all.add("name2");
	all.add("n1");
	all.add("na2");
	all.add("nam3");
	
	al.addAll(all);
	Iterator<String> it = al.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
}
}
