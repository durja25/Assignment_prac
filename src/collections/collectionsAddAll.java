package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsAddAll {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("C");
		l.add("C++");
		l.add("C#");
		l.add("java");
		System.out.println(l);

		Collections.addAll(l, "python", "rust");
		System.out.println(l);
		String[] strArr = { "go", ".Net" };
		Collections.addAll(l, strArr);
		System.out.println("After adding array collection value:" + l);

	}
}
