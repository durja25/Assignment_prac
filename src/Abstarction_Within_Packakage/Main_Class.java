package Abstarction_Within_Packakage;

public class Main_Class extends AbstClass {
	
	String name;
	void getVal(String name)
	{
		this.name=name;
	}
	void display()
	{
		System.out.println("Hello\n"+name);
	}
	@Override
	void getVal() {
		// TODO Auto-generated method stub
		
	}

}
