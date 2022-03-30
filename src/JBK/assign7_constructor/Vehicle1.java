package JBK.assign7_constructor;

public class Vehicle1 {
	int maxSpeed=120;
}
class car extends Vehicle1{
	int maxSpeed=180;
	void display() {
		System.out.println("Maximum Speed: "+super.maxSpeed);	
		System.out.println("Maximum Speed: "+maxSpeed);

	}
}
