package JBK.assign7_constructor;

public class Student {

	private int stuID;
	private String stuName;
	private int stuAge;

	Student() {
		stuID = 101;
		stuName = "student";
		stuAge = 21;
	}

	Student(int num1, String str, int num2) {
		stuID = num1;
		stuName = str;
		stuAge = num2;
	}

//getter and setter Methods
	public int getStuID() {
		return stuID;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

}
