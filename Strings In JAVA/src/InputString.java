import java.util.Scanner;

public class InputString {

	public static void main(java.lang.String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//There is no method as nextChar(0) in java
		System.out.println("Enter character : ");
		char ch = sc.next().charAt(0);
		System.out.println("ch : "+ch);
		
		System.out.println("enter string : ");
		java.lang.String str = sc.next();
		System.out.println(str);
		
		//issue with nextLine() method 
		//nextInt() returns 1 and cursor it at end of 1 (1_<-here is the cursor)
		//which is consumed by nextLine() method
		sc.nextLine();
		System.out.println("enter line : ");
		java.lang.String str1 = sc.nextLine();
		System.out.println("str1 : "+str1+"end");
		
	//Multiline String literal..
		
		java.lang.String str2 = """ 
				line 1
				line 2
				line 3
				"""; 
		
		System.out.println(str2);
		
		for(int i=0; i<str2.length(); i++){
			System.out.println(str2.charAt(i));
		}
		
		System.out.println(str2.length());
	      
		java.lang.String str3 = "line1 "
				+ "line2 "
				+ "line3";

		System.out.println("str3 : "+str3);
		
	}

}
