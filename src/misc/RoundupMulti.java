package misc;

public class RoundupMulti {
public static void main(String[] args) {
	int n = 0;
	System.out.println(n%5);
	if(n%5==0){
		System.out.println(n);
	}else{
		while(n%5!=0){
//			System.out.println(n);
			n++;
			
		}
		System.out.println(n);
	}
}
}
