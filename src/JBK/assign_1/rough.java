package JBK.assign_1;

public class rough {
	static int has(int num, int d) {
		int count =0;
		 do {
			if(num % 10 == d) {
				count++;
			}
			num = num / 10;
		}while (num > 0);
		return count;
	}

	public static int nbDig(int n, int d) {
		int  sum =0;
		for (int i = 0; i <= n; i++) {
			int sq = i * i;
				sum += has(sq,d);
		}
		System.out.println(sum);
		return 0;
		
	}

	public static void main(String[] args) {
		nbDig(5750, 0); //9481
//		4700
	}
}
