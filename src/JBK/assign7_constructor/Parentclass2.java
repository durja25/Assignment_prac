package JBK.assign7_constructor;

public class Parentclass2 {
	void display()
	{
	System.out.println("Parent class method");
	}
}

class SubClass2 extends Parentclass2{
	void display()
	{
		System.out.println("Child class method");
	}
	
	void printMsg()
	{
		display();
		super.display();
	}
}
