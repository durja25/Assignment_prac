package JBK.assign4;

public class ReversOfString {
	public static void main(String[] args) {
		String s="Java";
		int n = s.length();
		char[] ch=s.toCharArray();  
		for(int i = n - 1; i >= 0; i--){  
		System.out.print(ch[i]); 
		}
	/*String rev=new String(a);
	System.out.println(rev);*/
	}
}
