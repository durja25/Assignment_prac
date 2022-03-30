package JBK.assign8_Poly;

public class Main_Overload {
	public static void main(String[] args) {
		Overload o = new Overload();
		o.demo(1);
		o.demo(1.23);
		System.out.println(o.demo(1.23));
		o.demo(1, 2);
		o.demo(1, 3);
		o.demo(1, 4, 2);
		System.out.println(o.demo(1, 4, 2));
	}
}
