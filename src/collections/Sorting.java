package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sorting {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();  
	al.add("Viru");  
	al.add("Saurav");  
	al.add("Mukesh");  
	al.add("Tahir");  
	  
	Collections.sort(al);  
	Iterator itr=al.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	 }
//	
//	ArrayList alt=new ArrayList();  
//	alt.add(Integer.valueOf(201));  
//	alt.add(Integer.valueOf(101));  
//	alt.add(230);  //internally will be converted into objects as Integer.valueOf(230)  
//	  
//	Collections.sort(alt);  
//	  
//	Iterator itr1=alt.iterator();  
//	while(itr1.hasNext()){
//		
//		System.out.println(itr1.next());  
//	}
}
}
