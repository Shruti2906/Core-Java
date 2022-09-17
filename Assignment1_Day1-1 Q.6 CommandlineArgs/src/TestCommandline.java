import java.util.Scanner;
import java.io.*;
public class TestCommandline {

	public static void main(String[] args) {

		System.out.println("Length of Given String : "+args.length);
		System.out.println("String in UpperCase : ");
		for(int i=0; i<args.length; i++) {
			System.out.println("\t"+args[i].toUpperCase());
		}
		System.out.println("String in Lower Case : ");
		for(int i=0; i<args.length; i++) {
			System.out.println("\t"+args[i].toLowerCase());
		}
		
		System.out.println("\nPallindrome or Not : \n");
		for(int i=0; i<args.length; i++) {
			boolean b = true;
			for(int j=0,k=args[i].length()-1; j<k; j++,k--) {
				if(args[i].charAt(j) != args[i].charAt(k)) {
					b = false;
				//	System.out.println("in inner loop");
					break;
				}
			}
			if(b) {
				System.out.println("Pallindrome");
			}
			else {
				System.out.println("Not Pallindrome");
			}
		}
		
	}

}
