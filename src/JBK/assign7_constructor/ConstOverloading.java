package JBK.assign7_constructor;
/*
 * Program for Constructor  with this()
 * main--- Main_ConstructorOverlaoding
*/

public class ConstOverloading {
public int Rollno=107;
ConstOverloading(){
	Rollno =100;
}
ConstOverloading(int num){
	this();
	Rollno=Rollno+num;
}
public int getRollNum() {
	return Rollno;
}
public void setRollnum(int rollnum) {
	// TODO Auto-generated method stub
	this.Rollno=rollnum;
}
}
