
public class Test {

	public static void main(String[] args) {
		
	
		String  str = "12:30";//"01:30";
		char h1 = str.charAt(0);
		char h2 = str.charAt(1);
		char m1 = str.charAt(3);
		char m2 = str.charAt(4);
		
		String shr = ""+h1+h2;
		String sm = ""+m1+m2;
		
		System.out.println(shr);
		int ihr = Integer.parseInt(shr);
		int m = Integer.parseInt(sm);
		
		System.out.println(ihr);
		System.out.println(m);
		
			if(ihr >=1 && ihr<=12 && m==0 ) {
				System.out.println("AM");
			}
			else if(ihr ==0 && m>=1 && m<=60) {
				System.out.println("AM");
			}
			else if (ihr>=1 && ihr<=11 && m>=1 && m<= 60) {
				System.out.println("AM");
			}
			else{
				System.out.println("PM");
			}
		
	}

}
