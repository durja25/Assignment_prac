package StringOperation;

public class StringMethods {
//	1	char charAt(int index)	returns char value for the particular index
//	2	int length()	returns string length
//	3	static String format(String format, Object... args)	returns a formatted string.
//	4	static String format(Locale l, String format, Object... args)	returns formatted string with given locale.
//	5	String substring(int beginIndex)	returns substring for given begin index.
//	6	String substring(int beginIndex, int endIndex)	returns substring for given begin index and end index.
//	7	boolean contains(CharSequence s)	returns true or false after matching the sequence of char value.
//	8	static String join(CharSequence delimiter, CharSequence... elements)	returns a joined string.
//	9	static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)	returns a joined string.
//	10	boolean equals(Object another)	checks the equality of string with the given object.
//	11	boolean isEmpty()	checks if string is empty.
//	12	String concat(String str)	concatenates the specified string.
//	13	String replace(char old, char new)	replaces all occurrences of the specified char value.
//	14	String replace(CharSequence old, CharSequence new)	replaces all occurrences of the specified CharSequence.
//	15	static String equalsIgnoreCase(String another)	compares another string. It doesn't check case.
//	16	String[] split(String regex)	returns a split string matching regex.
//	17	String[] split(String regex, int limit)	returns a split string matching regex and limit.
//	18	String intern()	returns an interned string.
//	19	int indexOf(int ch)	returns the specified char value index.
//	20	int indexOf(int ch, int fromIndex)	returns the specified char value index starting with given index.
//	21	int indexOf(String substring)	returns the specified substring index.
//	22	int indexOf(String substring, int fromIndex)	returns the specified substring index starting with given index.
//	23	String toLowerCase()	returns a string in lowercase.
//	24	String toLowerCase(Locale l)	returns a string in lowercase using specified locale.
//	25	String toUpperCase()	returns a string in uppercase.
//	26	String toUpperCase(Locale l)	returns a string in uppercase using specified locale.
//	27	String trim()	removes beginning and ending spaces of this string.
//	28	static String valueOf(int value)	converts given type into string. It is an overloaded method.

	public static void main(String[] args) {
	String s = "MainStringJava";
	String s1 = "newadd";
//	//returns char value for the particular index
//	System.out.println(s.charAt(5));
//	//	returns string length
//	System.out.println(s.length());
//	//	returns a formatted string.
//    String str1 = String.format("%d", 101);          // Integer value  
//    String str2 = String.format("%s", "name"); 		 // String value  
//    String str3 = String.format("%f", 101.00);       // Float value  
//    String str4 = String.format("%x", 101);          // Hexadecimal value  
//    String str5 = String.format("%c", 'c');          // Char value  
//    System.out.println(str1);  
//    System.out.println(str2);  
//    System.out.println(str3);  
//    System.out.println(str4);  
//    System.out.println(str5);
//	//	substring(int beginIndex, int endIndex)
//    System.out.println(s.substring(0,s.length()-1));
    System.out.println(s.substring(4));
////    returns true or false after matching the sequence of char value.
//    System.out.println(s.contains("J"));
	// returns a joined string.
//	 String date = String.join("/","25","06","2018");    
//     System.out.print(date);    
//     String time = String.join(":", "12","10","10");  
//     System.out.println(" "+time);  
//   checks the equality of string with the given object.
//	System.out.println(s.equals(s1));
//	checks if string is empty. returns true or false
//	System.out.println(s.isEmpty());
	//concatenates the specified string.
//	System.out.println(s.concat(s1));
	//replaces all occurrences of the specified char/charseq value.
//	System.out.println(s.replace("Java", "lang"));
	//compares another string. It doesn't check case.
//	System.out.println(s.equalsIgnoreCase("mainstringjava"));
	
}
}
