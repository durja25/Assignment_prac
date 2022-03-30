package JBK.assign7_constructor;

//Program for constructor chaining Demo

public class ChainningDemo {
	public ChainningDemo() {
		System.out.println("Default Constructor");
	}

	public ChainningDemo(String str) {
		this();
		System.out.println("Parameterized Const");
	}

	public ChainningDemo(String str, int num) {
		this("hello");
		System.out.println("Parameterized constructor with double args");
	}

	public ChainningDemo(int num1, int num2, int num3) {
		this("hell", 2);
		System.out.println("Parameterized constructor with three args");
	}

	@SuppressWarnings("unused")

	public static void main(String[] args) {
		ChainningDemo o = new ChainningDemo(12, 2, 2);
	}

}
