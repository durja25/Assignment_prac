package JBK.assign7_constructor;

public class Main_Singleton1 {
public static void main(String[] args) {
	Singleton1 a = new Singleton1();
	Singleton1 b = new Singleton1();
	
	a.x= a.x+10;
	System.out.println("Value of a.x="+a.x);
	System.out.println("value of b.x="+b.x);

	
}
}
