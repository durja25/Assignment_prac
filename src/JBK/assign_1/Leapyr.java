package JBK.assign_1;

public class Leapyr {
public static void main(String[] args) {
	int year = 2022;
	if ((year%400==0)|| ((year%4==0)&&(year%100!=0))) {
		System.out.println("year "+year+ " is leap");
	}else {
		System.out.println("not leap"+year);
	}
}
}
