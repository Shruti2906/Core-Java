
import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		BookInfo bInfo = new BookInfo();
		MemberInfo mInfo = new MemberInfo();
		IssuedInfo iInfo = new IssuedInfo();
		
		int ch;
		String str;
		
		do {
			
			System.out.println("\n---------------------------------------------------------------------------");
			System.out.println("*************************** Saraswati Library ****************************");
			System.out.println("---------------------------------------------------------------------------");
			
			System.out.println("\t\t\t1  :  Book\n\t\t\t2  :  Member\n\t\t\t3  :  Issue Book");
			System.out.println("\t\t\tEnter Your Choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
					System.out.println("\n\t\t\t1) Add Book\n\t\t\t2) Display Book\n\t\t\t3) Search Book");
					int bch = sc.nextInt();
					switch(bch) {
					case 1:
						bInfo.addBook();
						break;
					case 2:
						bInfo.displayBook();
						break;
					case 3:
						System.out.println("\n\t\t\tEnter Book Id To Search Book : ");
						int id = sc.nextInt();
						Book book = bInfo.searchBook(id);
						if(book != null) {
							bInfo.displayBook(book);
						}
						else {
							System.out.println("\n\t\t\tSorry Book is Not Available..!");
						}
						break;
					default:System.out.println("\n\t\t\tInvalid Choice..!");
					}
				break;
			case 2:
				System.out.println("\n\t\t\t1) Add Members\n\t\t\t2) Display Members\n\t\t\t3) Search Members");
				int cch = sc.nextInt();
				switch(cch) {
				case 1:
					mInfo.addMember();
					break;
				case 2:
					mInfo.displayMember();
					break;
				case 3:
					System.out.println("\n\t\t\tEnter Member Id To Search Member : ");
					int id = sc.nextInt();
					Member member = mInfo.searchMember(id);
					if(member != null) {
						mInfo.displayMember(member);
					}
					else {
						System.out.println("-----------------------------------------------------------------------------");
						System.out.println("\n\t\t\tSorry ..Member is Not Registered..!");
					}
					break;
				default:System.out.println("\tInvalid Choice.!");
				}
				break;
				
			case 3:
				System.out.println("\n\t\t\t1) Issue Book\n\t\t\t2) Display Isseued Books Records\n\t\t\t3) Search Record");
				int ich = sc.nextInt();
				switch(ich) {
				case 1:
					iInfo.issueBook();
					break;
				case 2:
					iInfo.displayRecord();
					break;
				case 3:
					 IssueBook iBook = iInfo.searchRecord();
					 if(iBook != null) {
						 iInfo.displayRecord(iBook);
					 }
					 else {
						 System.out.println("---------------------------------------------------------------------------");
						 System.out.println("\tRecord Does NOT exist..!");
						 System.out.println("---------------------------------------------------------------------------");
					 }
					break;
				default:
				}
				break;
				
			default: System.out.println("\tInvalid Choice..");
			}
			
			System.out.println("=================================================================================");
			System.out.println("\n\t\t\tDo You Want to Continue to Main Page(Y/N) : ");
			
			str = sc.next();
		}while(str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes"));
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("\t\t\tThank You..Visit Again..!!");
		System.out.println("-----------------------------------------------------------------------------------");
	}

}
