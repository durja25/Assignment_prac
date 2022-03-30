package JBK.assign4;

import java.util.Scanner;

public class NaturalNumAndTheirSum {
	public static void main(String[] args) {
		int n, sum = 0;
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Input number");
			n = sc.nextInt();
			sc.close();
		}
		System.out.println("1st Natural number: "+n);
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("\n"+"The sum of natural number up to n terms: "+sum);

	}
}
