package JBK.assign5_inheritance;

/*
 * Inheritance program
 * Main== Main_Hierarchical

*/
public class Hierarchical {
	public void methodA()
	{
	System.out.println("Method of class A");
	}
}

class B1 extends Hierarchical{
	public void methodB()
	{
	System.out.println("Mehtod of class B");
	}
}

class C extends Hierarchical{
	public void methodC()
	{
	System.out.println("Method of class C");
	}
}

class D extends Hierarchical{
	public void methodD(){
		System.out.println("Method of class D");
	}
}
