package JBK.assign_1;

import java.util.Scanner;

public class swap_wouttemp {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value for a");
	int a=sc.nextInt();
	
	System.out.println("Enter the value for b");
	int b=sc.nextInt();
	
	System.out.println("Before Swapping of values a="+a+"and b="+b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("swaped \na="+a+"\nb="+b);
	
	sc.close();
	}
}
