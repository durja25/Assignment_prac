package JBK.assign3_Logical;

import java.util.Scanner;

public class F2c {
	public static void main(String[] args) {
		float temprature=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temprature in farehn");
		temprature= sc.nextInt();
		temprature=((temprature-32)*5)/9;
		System.out.println("temp.to Celsius="+temprature);
		sc.close();
	}
}
