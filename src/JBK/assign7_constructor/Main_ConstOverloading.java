package JBK.assign7_constructor;

public class Main_ConstOverloading {
	public static void main(String[] args) {
		ConstOverloading o = new ConstOverloading();
		System.out.println(o.getRollNum());

		ConstOverloading o1 = new ConstOverloading();
		o1.setRollnum(30);
		System.out.println(o1.getRollNum());

		System.out.println(o1.Rollno);
	}
}
