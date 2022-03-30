package JBK.assign2;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		int n,a= 0,b=0,c=1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("fib series");
		for (int i = 1; i <= n; i++) {
			a=b;
			b=c;
			c =a+b;
			System.out.print(a+" ");
		}
		sc.close();
	}
}
