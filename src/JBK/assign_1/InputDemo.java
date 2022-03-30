package JBK.assign_1;

import java.util.Scanner;

public class InputDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		String word1;
		System.out.println("Enter a no:");
		num1 = sc.nextInt();
		System.out.println("Enter a word");
		word1 = sc.next();
		System.out.println("Your input are...");
		System.out.println("The no. eneterd is " + num1);
		System.out.println("The word eneterd is " + word1);
		sc.close();
	}
}
