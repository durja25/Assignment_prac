package JBK.assign_1;

public class Reversenum {
public static void main(String[] args) {
	int num = 2134;
	int rev = 0;
	int temp =0;
	while (num >0) {
		temp = num%10;
		rev=rev*10+temp;
//		num = num/10;
		num /=10;
		
	}
	System.out.println("rev num is: "+rev);
			
}
}
