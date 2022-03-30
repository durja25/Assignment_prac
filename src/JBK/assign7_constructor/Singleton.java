package JBK.assign7_constructor;

/*
 * The primary purpose of a Single class is to restrict the limit of the number of object creation to only one.
 * 2 points to remember
 * Make a constructor private.
 * Write a static method that has the return type object of this singleton class. 
 * Here, the concept of Lazy initialization is used to write this static method.
 * https://www.geeksforgeeks.org/singleton-class-java/
 * used for resource mgmt
 * access control to resource
*/
public class Singleton {
	// Static variable reference of single_instance
	// of type Singleton
	private static Singleton object;

// Constructor
// Here we will be creating private constructor
// restricted to this class itself
	private Singleton() {

	}

//Static method
// Static method to create instance of Singleton class
	public static Singleton getInstance() {
		if (object == null) {
			object = new Singleton();
		}
		return object;
	}

	public void getSomething() {
		System.out.println("here!");
	}

	public static void main(String[] args) {
		Singleton st = new Singleton();
		st.getSomething();
	}

}
