
import java.util.Scanner;

public class HotelMenu {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String[] menuName = {"maggie", "noodles", "pizza", "burger", "pasta"};
		float[] menuPrice = {30, 120, 270, 200, 150};
		int[] order=new int[10];
		
		System.out.println("******** Menu Card *********");
		System.out.println("\nSr.No\t\tmenu Name\t\tmenu Price");
		for(int i=0; i<menuName.length; i++) {
			System.out.println(i+1+"\t\t"+menuName[i]+"\t\t\t"+menuPrice[i]);
		}
		System.out.println();
		int ch, cnt=0, or;
		do
		{
			
			System.out.println("Enter order No : ");
			or = sc.nextInt();
			order[cnt] = or;
			System.out.println("orde[cnt] : "+order[cnt]);
			cnt++;
			System.out.println("Here is your dish..!!");
			System.out.println("------------------------------------------------------\n");
			System.out.println("1 : Place another order\n2 : Get Bill\n\t");
			ch = sc.nextInt();
			
		}while(ch == 1);
		
		float cgst=0, sgst=0, gst=0;
		float total=cgst+sgst+gst;
		float finalTotal;
		
		for(int i=0; i<cnt; i++) {
			total += menuPrice[order[i]-1];
		}
		
		cgst = total*0.36f;
		sgst = total*1.2f;
		gst = total*0.18f;
		
		finalTotal = total+cgst+sgst+gst;
	
		System.out.println("---------------------------------------------------------------------------------------\n");
		System.out.println("Order No\t\tBill\n");
		for(int i=0; i<cnt; i++) {
			System.out.println(order[i]+"\t:\t\t"+menuPrice[order[i]-1]);
		}
		
		System.out.println("Total\t=\t\t"+total);
		
		System.out.println("cgst\t:\t\t"+cgst);
		System.out.println("sgst\t:\t\t"+sgst);
		System.out.println("gst\t:\t\t"+gst);
		System.out.println("Final Total/Bill  :  "+finalTotal);
		System.out.println("\n---------------------------------Thank You !!------------------------------------------");
		
	}

}
