package JBK.assign5_inheritance;

public class Main_Vehicle {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		c1.color = "Blue";
		c1.speed = 200;
		c1.size = 22;
		c1.display();
		c1.cc = 1000;
		c1.gears = 5;
		c1.displayCar();
	}
}
