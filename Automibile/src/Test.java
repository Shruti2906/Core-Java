
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			Automobile a = null;
			
			int ch, chh;
			String str;
			
			do {
				System.out.println("============================================================================");
				System.out.println("========================== Welcome To Automobile ===========================");
				System.out.println("============================================================================");
				System.out.println("\n\t\t1 - Car\n\t\t2 - Bike ");
				System.out.println("\t\tSelect Choice : ");
				chh = sc.nextInt();
				if(chh == 1) {
					do {
						System.out.println("-------------------------------- Car ---------------------------------");
						System.out.println("\t\t1 : Maruti\n\t\t2 : Toyota\n\t\t3 : BMW");
						System.out.println("\t\tEnter your favorite Car : ");
						ch = sc.nextInt();
						
						switch(ch) {
						
						case 1 : 
								a = new Maruti();
								display(a, "Maruti");
							break;
							
						case 2:
								a = new Toyota();
								display(a, "toyota");
							
							break;
							
						case 3:
								a = new BMW();
								display(a, "BMW");
							break;
							
						default: System.out.println("Your favorite Car doesn't exist..!!");
						}
						System.out.println("\tWant to Continue with Car (Y/N) : ");
						str = sc.next();
					}while(str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes"));
				}
				else if(chh == 2) {
					
					do {
						System.out.println("-------------------------------- Bike ---------------------------------");
						System.out.println("\t\t1 : HeroHonda\n\t\t2 : Bajaj");
						System.out.println("\t\tEnter your favorite Bike : ");
						ch = sc.nextInt();
						
						switch(ch) {
						
						case 1 : 
								a = new HeroHonda();
								display(a, "HeroHonda");
							break;
							
						case 2:
								a = new Bajaj();
								display(a, "Bajaj");
							
							break;
							
						default: System.out.println("Your favorite Bike doesn't exist..!!");
						}
						System.out.println("\tWant to Continue with Bike (Y/N) : ");
						str = sc.next();
					}while(str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes"));
				}
				else {
					System.out.println("\t\tInvalid choice....");
				}
				System.out.println("\t\tWant to goto Main Menu (y/n) : ");
				str = sc.next();
			}while(str.equalsIgnoreCase("y") || str.equalsIgnoreCase("y"));
			System.out.println("\t\tThank You .!");

	}
	
	public static void display(Automobile a, String str) {
		
		System.out.println("\t\t"+str+" Model  : "+a.getModel());
		System.out.println("\t\t"+str+" Color  : "+a.getColor());
		System.out.println("\t\t"+str+" Price  : "+a.getPrice());
		if(a instanceof Car) {
			Car c = (Car)a;
			System.out.println("\t\tNo of CC  : "+c.getNoOfAirBags());
		}
		if(a instanceof Bike) {
			Bike b = (Bike)a;
			System.out.println("\t\tNo of CC  : "+b.getNoOfCC());
		}
	
	}

}
