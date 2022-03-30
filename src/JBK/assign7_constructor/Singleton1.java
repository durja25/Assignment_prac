package JBK.assign7_constructor;

//Main - Main_Singleton1

public class Singleton1 {
static Singleton1 instance = null;
public int x=10;
public static Singleton1 getinstance() {
	if (instance ==null) {
		instance = new Singleton1();
	}return instance;
}
	
	
}
