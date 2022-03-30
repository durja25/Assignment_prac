package JBK.assign7_constructor;

//Program for cunstructor(parameterized)calling 

public class Vehicle {
	int wheels;

	private Vehicle(int wheels) {
		this.wheels=wheels;
		System.out.println(wheels+" Wheeler vehicle created");

	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Vehicle v1=new Vehicle(2);
		Vehicle v2=new Vehicle(3);
		Vehicle v3=new Vehicle(4);
		
	}
}
