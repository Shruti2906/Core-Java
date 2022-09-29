
public class StringBuilderDemo {

	//StringBuffer vs StringBuilder
	
	//both string buffer and stringBuilder classes are provide for mutable strings
	//the difference is StringBuffer is thread safe and StringBuilder is not
	
	//StringBuilder is faster in performance than StringBuffer
	
	public static void main(java.lang.String[] args) {

		// A mutable sequence of characters.
		//but with no guarantee of synchronization.
		//StringBuilder
		StringBuilder sb = new StringBuilder("Tonny");
		System.out.println(sb);
		
		System.out.println(sb.toString());
		
		sb.setCharAt(0, 'a');
		
		System.out.println(sb);
		
		sb.insert(0, 1);
		
		System.out.println(sb);
		
		sb.delete(1, 2);//2 exclusive
		
		System.out.println(sb); 
		
		sb.append("stark");//in case of string it would be str = str+"stark"; and new string will be created each time 
			
		System.out.println(sb);
		
//		StringBuffer
		StringBuffer sf = new StringBuffer("Tonny");
		System.out.println(sf);
		
		// StringBuffer is A thread-safe, mutable sequence of characters.
		
	}

}
//The default capacity of the buffer is 16. 
//If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2.
