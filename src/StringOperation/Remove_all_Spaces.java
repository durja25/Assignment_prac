package StringOperation;

import java.util.Scanner;

public class Remove_all_Spaces {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String u want: ");
		s = sc.nextLine();

		/*
		 * by using replace method String s1=s.replaceAll(" ","");
		 * System.out.println(s1); 
		 * without using replace all method
		 */
		char[] sArray = s.toCharArray();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < sArray.length; i++) {
			if ((sArray[i] != ' ') && (sArray[i] != '\t')) {
				sb.append(sArray[i]);
			}

		}
		System.out.println(sb);
		sc.close();
	}
}
