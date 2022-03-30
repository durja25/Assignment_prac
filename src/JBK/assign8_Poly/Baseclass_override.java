package JBK.assign8_Poly;

public class Baseclass_override {

	public void method() {
		System.out.println("I,m the method of base class");
	}
	
}

class Derivedclass extends Baseclass_override{
	public void method(){
		System.out.println("I am the method driver class");

	}
}
