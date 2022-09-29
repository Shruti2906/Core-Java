
public class String {

	public static void main(java.lang.String[] args) {

		// Strings are stored in the String Constant Pool.
		// Character Arrays are stored in the Heap
		
		//String class provide built in methods
		//no built in methods are provided for charArray
		
		// strings are Not preferred for storing passwords in Java.	
		// char arrays are Preferred for storing passwords in Java.
		
		//A String can be converted into Character Array by using the toCharArray() method of String class.
		//Eg: String s = “GEEKS”; char [] ch = s.toCharArray();
		//A Character Array can be converted into String by passing it into a String Constructor. 
		//Eg: char[] a = {‘G’, ‘E’, ‘E’, ‘K’, ‘S’}; String A = new String(a);
		
			java.lang.String str = "Hello";
			System.out.println(str);

	}

}
