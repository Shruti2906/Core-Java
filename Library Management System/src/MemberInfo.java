import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MemberInfo {
	
	static final int memberCapacity = 100;
	static int totalRegisteredmembers = 0;
	static Member memberArr[] = new Member[memberCapacity];
	
	Scanner sc = new Scanner(System.in);
	
	public void addMember() throws ParseException {
	
		String str;
		do 
		{
			System.out.println("Enter Member Id : ");
			int id = sc.nextInt();
			System.out.println("Enter Member Name : ");
			String name = sc.next();
			System.out.println("Enter Member Occupation");
			String occu = sc.next();
			System.out.println("Enter Member Date of Birth : ");
			String sdate = sc.next();
			Date date = new SimpleDateFormat("dd/mm/yyyy").parse(sdate);
			memberArr[totalRegisteredmembers] = new Member(id, name, occu, date, new Date());
			totalRegisteredmembers++;
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("Member Added Successfully.!\n");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("Want to Add More Members(y/n) : ");
			str = sc.next();
					
		}while(str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes"));
		
	}
	
	public void displayMember() {
		
		System.out.println("********************************* Saraswati Library *********************************");
		System.out.println("-------------------------------- Registered Members ---------------------------------");
		
		for(int i=0; i<totalRegisteredmembers; i++) {
			System.out.println("\tMember Id\t\t\t:\t\t"+memberArr[i].getMemberId());
			System.out.println("\tMember Name\t\t\t:\t\t"+memberArr[i].getMemeberName());
			System.out.println("\tMember Occupation\t\t:\t\t"+memberArr[i].getMemberOccupatuion());
			System.out.println("\tMember Date Of Birth\t\t:\t\t"+memberArr[i].getDob());
			System.out.println("\tMember Date Registration\t:\t\t"+memberArr[i].getRegisteredDt());
			System.out.println("------------------------------------------------------------------------------------");
		}
	}
	
	public void displayMember(Member member) {
			
			System.out.println("******************************** Saraswati Library ********************************");
			System.out.println("--------------------------------- Members Details --------------------------------");
			
			System.out.println("\tMember Id\t\t\t:\t\t"+member.getMemberId());
			System.out.println("\tMember Name\t\t\t:\t\t"+member.getMemeberName());
			System.out.println("\tMember Occupation\t\t:\t\t"+member.getMemberOccupatuion());
			System.out.println("\tMember Date Of Birth\t\t:\t\t"+member.getDob());
			System.out.println("\tMember Date Registration\t:\t\t"+member.getRegisteredDt());
			System.out.println("---------------------------------------------------------------------------------");
		
	}
		
	public Member searchMember(int id) {
		
		Member member = null;
		for(int i=0; i<totalRegisteredmembers; i++) {
			if(id == memberArr[i].getMemberId()) {
				return memberArr[i];
			}
		}
		return member;	
		
	}
	
}
