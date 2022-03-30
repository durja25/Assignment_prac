package loop;

public class IfElseTernaryExample {
	public static void main(String[] args) {
		int num = 13;
		// If the condition is true, the result of ? is returned. But, if the condition
		// is false, the result of : is returned.
		String s = (num % 2 == 0) ? "even" : "odd";
		System.out.println(s);
	}

}
