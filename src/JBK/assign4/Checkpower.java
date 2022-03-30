package JBK.assign4;

public class Checkpower {
	public static boolean check(int num) {
//		int num=14;
		if(num<=0){
			return false;
		}
		while(num>1){
			if(num%2!=0){
				return false;
			}
			num=num/2;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(check(14));
	}

}
