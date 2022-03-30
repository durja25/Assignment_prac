package JBK.assign3_Logical;

public class BooleanOperator {
	public static void main(String[] args) {
		boolean A=true;
		boolean B=false;
		// A or B any one true then true
		System.out.println("A|B=	 "+(A|B));
		// Both true then true else false
		System.out.println("A&B=	 "+(A&B));
		// ! means not ; not true is false
		System.out.println("!A=  	 "+(!A));
		// a xor a = true
		System.out.println("A^B=	 "+(A^B));
		// true or true and true = true
		System.out.println("(A|B)&A= "+((A|B)&A));
	}
}
