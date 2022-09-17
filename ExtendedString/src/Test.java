import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		

		String es;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int x = sc.nextInt();

		for(int i=0; i<s.length(); i++){
			System.out.println("outer "+s.charAt(i));
			
			if(s.charAt(i)<=50 && s.charAt(i)>=57)
			{
				System.out.println("inner "+s.charAt(i));
				for(int j=0; j<s.charAt(i); j++)
				{
					for(int k=0; k<=i; k++){
						System.out.print(s.charAt(i));
					}	
				}
			}
			System.out.print(s.charAt(i));
		}
//		sop(s[i]);

		
		

	}

}
