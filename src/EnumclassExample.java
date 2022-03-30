/*
 * Enum improves type safety
 * Enum can be easily used in switch
 * Enum can be traversed
 * Enum can have fields, constructors and methods
 * Enum may implement many interfaces 
 * but cannot extend any class because it internally extends Enum class
*/
public class EnumclassExample {
	// defining the enum inside the class
	public enum Season {
		WINTER, SPRING, SUMMER, FALL
	}

	// main method
	public static void main(String[] args) {
		// traversing the enum
		for (Season s : Season.values())
			System.out.println(s);
		
		System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
		System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());  
		System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());  
		 
	}
}
