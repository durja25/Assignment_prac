package JBK.assign5_inheritance;

/*
 * program for multilevel Inheritance
 * Main--Main_X
*/

public class X {
	public void methodX() 
	{
	System.out.println("Class X Method");
	}
}

class Y extends X{
	public void MethodY()
	{
		System.out.println("Class Y method");
	}
}

class Z extends Y {
	public void methodZ()
	{
		System.out.println("class Z method");
	}
}