package JBK.assign_1;

public class ObjectDemo {
	int a;
	int b = 20;

	void m1() {
		a = 10;
		int c = 30;
		System.out.println(a);
		System.out.println(c);
	}

	public static void main(String[] args) {
		ObjectDemo cs = new ObjectDemo();
		cs.m1();
		System.out.println(cs.b);
	}

}
