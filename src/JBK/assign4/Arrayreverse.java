package JBK.assign4;

import java.util.Arrays;

public class Arrayreverse {
public static void main(String[] args) {
	int a[]={1,2,3,4,5,6,7,8,9};
	int n1=0,n2 =a.length-1;
	int temp=0;
	while (n1!=n2||n1<n2) {
		temp=a[n1];
		a[n1]=a[n2];
		a[n2]=temp;
		n1++;
		n2--;

	}
	System.out.println(Arrays.toString(a));
//	for(int i=0;i<a.length;i++){
//		System.out.println(a[i]+"");
//	}
}
}
