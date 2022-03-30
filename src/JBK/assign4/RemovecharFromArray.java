package JBK.assign4;

public class RemovecharFromArray {
public static void main(String[] args) {
	String s="public static char";
	String  r[]=s.split("s|h");
	String res="";
	for(String m:r){
		res=res+m;
		}
	System.out.println(res);
}
}
