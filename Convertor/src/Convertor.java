
import java.util.Scanner;

public class Convertor {

	Scanner sc = new Scanner(System.in);
	
	public void Currency() {
		
		System.out.println("1 : Dollar to Rupee\n2 : Rupee to Dollar\n3 : euros to rupee\n4 : rupee to euro");
		System.out.println("Enter your choice : ");
		int ch = sc.nextInt();
		int amt, rAmt;
		
		switch(ch)
		{
		case 1:
				System.out.println("Enter Dollar Amount : ");
				amt = sc.nextInt();
				rAmt = amt*75;
				System.out.println(amt+" in Rupees : "+rAmt+" INR");
				break;
		
		case 2:
			System.out.println("Enter Rupee Amount : ");
			amt = sc.nextInt();
			rAmt = amt/75;
			System.out.println(amt+" in Dollar : "+rAmt+" $");
			break;
			
		case 3:
			System.out.println("Enter euro Amount : ");
			amt = sc.nextInt();
			rAmt = amt*85;
			System.out.println(amt+" in Rupees : "+rAmt+" INR");
			break;
			
		case 4:
			System.out.println("Enter rupee Amount : ");
			amt = sc.nextInt();
			rAmt = amt/85;
			System.out.println(amt+" in Euro : "+rAmt+" €");
			break;
		
		case 5:
			System.out.println("Working in progress..");
				break;
				
		default:System.out.println("Invalid choice..!!");
		}
		
	}
	
	public void length() {
		
		System.out.println("1 : Meter to centimeter \n2 : centimeter to meter\n3 : inches to cm\n4 : cm to inches\n5 : foot to inches\n6 : inches to foot");
		System.out.println("Enter your choice : ");
		
		int ch = sc.nextInt();
		float l, rL;
		
		switch(ch)
		{
		
		case 1:
				System.out.println("Enter Meter : ");
				l = sc.nextFloat();
				rL = l*100;
				System.out.println(l+" in centimeter : "+rL+" cm");
				break;
		case 2:
			
				System.out.println("Enter Centimeter : ");
				l = sc.nextFloat();
				rL = l/100;
				System.out.println(l+" in Meter : "+rL+" m");
				break;
		case 3:
				System.out.println("Enter Inches : ");
				l = sc.nextFloat();
				rL = l*2.54f;
				System.out.println(l+" in centimeter : "+rL+" cm");
				break;
			
		case 4:
				System.out.println("Enter Inches : ");
				l = sc.nextFloat();
				rL = l*2.54f;
				System.out.println(l+" in centimeter : "+rL+" cm");
				break;
		case 5:
				System.out.println("Enter foot : ");
				l = sc.nextFloat();
				rL = l*12;
				System.out.println(l+" in inch : "+rL+" in");
				break;
		case 6:
				System.out.println("Enter Inches : ");
				l = sc.nextFloat();
				rL = l/12;
				System.out.println(l+" in foot : "+rL+" foot");
				break;
			
		default:System.out.println("Invalid choice..!!");
		
		}
		
	}
	
	public void volume() {
		
		System.out.println("1 : Liter to mililiter \n2 : mililiter to liter");
		System.out.println("Enter your choice : ");
		
		int ch = sc.nextInt();
		float v, rV;
		
		switch(ch)
		{
		
		case 1:
				System.out.println("Enter Liter : ");
				v = sc.nextFloat();
				rV = v*1000;
				System.out.println(v+" in Mililiter : "+rV+" ml");
				break;
		case 2:
			
				System.out.println("Enter Mililiter : ");
				v = sc.nextFloat();
				rV = v/1000;
				System.out.println(v+" in Liter : "+rV+" l");
				break;
				
		default:System.out.println("Invalid choice..!!");
		
		}
		
	}
	
	
}
