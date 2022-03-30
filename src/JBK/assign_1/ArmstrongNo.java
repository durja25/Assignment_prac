package JBK.assign_1;

public class ArmstrongNo {
	/*
	 * Armstrong number is a number that is equal to the sum of cubes of its digits.
	 * For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
	 */
public static void main(String[] args) {
	int c = 0,a,temp;
	int n =153;
	temp = n;
	while (n>0) {
		a= n%10;
		n=n/10;
		c=c+(a*a*a);
	}
	if (temp ==c) {
		System.out.println("Num is armstrong:"+c);
		System.out.println(c);
	}else {
		System.out.println("Num is not ArmStrong: "+temp);
	}
	
}
}
