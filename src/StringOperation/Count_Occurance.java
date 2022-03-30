package StringOperation;

import java.util.Scanner;

public class Count_Occurance {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		s = sc.nextLine();

		System.out.println("Word=:" + wordCount(s));
		sc.close();
	}

	public static int wordCount(String str) {
		int count = 1;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;
			}
		}
		return count;
	}

}
