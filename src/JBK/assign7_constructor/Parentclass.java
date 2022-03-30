package JBK.assign7_constructor;

//program for super variable
//Main-- Main_ParentClass


public class Parentclass {
int num=100;
}
class subclass extends Parentclass{
	int num =110;
	void printnumber() {
		System.out.println(super.num);
	}
}