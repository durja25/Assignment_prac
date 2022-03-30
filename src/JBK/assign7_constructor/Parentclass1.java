package JBK.assign7_constructor;

//Program for child class constructor call parent class constructor implicitly(means automatically or done by jvm) 
//main---Main_Parentclass1

public class Parentclass1 {
	Parentclass1()
	{
		System.out.println("Constructor of super class1");
	}
	}

	class SubClass1 extends Parentclass1
	{
		SubClass1()
		{
			System.out.println("Constructor of SubClass1");
		}
		
		SubClass1(int n)
		{
			System.out.println("Constructor with Arg");
		}
		
		void display()
		{
			System.out.println("Hello");
		}
		
}
