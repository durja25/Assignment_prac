package JBK.assign_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
public static void main(String[] args) {
	Date date = new Date();
	String strDateFormat ="HH:MM:ss";
	SimpleDateFormat stf = new SimpleDateFormat(strDateFormat);
	
	String DateFormat = "MM:dd:yyyy";
	SimpleDateFormat sdf = new SimpleDateFormat(DateFormat);
	
	System.out.println("Todays Date is =="+sdf.format(date));
	System.out.println("Todays time is =="+stf.format(date));

}
}
