package JBK.Assign9_StaticFinal;

//Program for final method demo

public class Finalex1 {
	final int a = 100;
	
	Finalex1() {
		System.out.println("This is default constructor of final ex1");
	}

	void show() {
		System.out.println(a);
	}

	void welcome() {
		System.out.println("Welcome to jbk");
	}

}

class FinalexTest extends Finalex1 {
//	void show() {
//		System.out.println("This is method of finalexTest");
//	}
//
//	public static void main(String[] args) {
//		Finalex1 s = new Finalex1();
//		s.show();
//	}
	public static void main(String[] args) {
		Finalex1 o = new Finalex1();
		o.show();
	}
}