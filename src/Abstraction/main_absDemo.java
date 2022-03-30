package Abstraction;

public class main_absDemo {

	/*
	 * void m2() {System.out.println("NAme1");
	 * 
	 * }
	 */
	public static void main(String[] args) {
		// abs_Demo a=new main_absDemo();
		abs_Demo a = new abs_Demo()// annonymous inner class
		{
			void m1() {
				System.out.println("Something in m1");
			}
		};

		a.m1();
		a.m2();
	}
}
