package JBK.assign5_inheritance;

/*
 * Program for single Inheritance
 * main method--Main_Vehicle
*/

public class Vehicle {
	String color;
	int speed, size;

	void display() {
		System.out.println("Color: " + color);
		System.out.println("speed: " + speed);
		System.out.println("size: " + size);
	}
}

class Car3 extends Vehicle {
	int cc;
	int gears;

	void displayCar() {
		System.out.println("color of car: " + color);
		System.out.println("speed of car: " + speed);
		System.out.println("Size of car: " + size);
		System.out.println("cc of car: " + cc);
		System.out.println("no. of gears of car: " + gears);
	}
}
