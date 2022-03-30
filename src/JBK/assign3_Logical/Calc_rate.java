package JBK.assign3_Logical;

import java.util.Scanner;

public class Calc_rate {
public static void main(String[] args) {
	double rate1=0.1;
	double rate2=0.15;
	double rate3=0.2;
	Scanner sc = new Scanner(System.in);
	double total =sc.nextDouble();
	// .2f are for 00 zeros
	System.out.printf("10%%:%.2f\n",(total*rate1));
	System.out.printf("15%%:%.2f\n",(total*rate2));
	System.out.printf("20%%:%.2f\n",(total*rate3));
	sc.close();
}
}
