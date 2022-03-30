package JBK.assign7_constructor;

public class ConstDemo {
	public ConstDemo() {
		System.out.println("Constructor Running");	
	}
	public ConstDemo(int a) {
		System.out.println("Constructor Running "+a);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConstDemo cd = new ConstDemo();
		ConstDemo cd1 = new ConstDemo(5);
	}
}
