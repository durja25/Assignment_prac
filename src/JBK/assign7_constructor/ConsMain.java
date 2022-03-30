package JBK.assign7_constructor;

public class ConsMain {
	private int x;

	private ConsMain() {
		System.out.println("Constructor called");
		x = 5;
	}

	public static void main(String[] args) {
		ConsMain o = new ConsMain();
		System.out.println("x= " + o.x);
	}
}
