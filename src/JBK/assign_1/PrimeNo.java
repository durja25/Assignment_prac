package JBK.assign_1;

public class PrimeNo {
	public static void main(String[] args) {
		int m = 0, flag = 0;
		int n = 10;
		m = n / 2;
		for (int i = 2; i <= m; i++) {
			if (n % 2 == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("prime no :" + n);
		else
			System.out.println("prime no :" + n);
	}
}
