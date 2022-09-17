import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class IssuedInfo {
	
	static final int RecordCapacity = 100;
	static int totalRecords = 0;
	static IssueBook recordArr[] = new IssueBook[RecordCapacity];

		public void issueBook() throws ParseException {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Member Id : ");
			int mId = sc.nextInt();
			MemberInfo mInfo = new MemberInfo();
			BookInfo bInfo = new BookInfo();
			IssueBook iBook = new IssueBook();
			
			if(mInfo.searchMember(mId) != null) {
				
				iBook.setMember(mInfo.searchMember(mId));
				
				System.out.println("Enter Book Id : ");
				int bId = sc.nextInt();
				Book book = bInfo.searchBook(bId); 
				if(book != null) {
					if(book.getBookAvailableCnt() > 0) {

						System.out.println("Enter Book Issue Id : ");
						int id = sc.nextInt();
						
						iBook.setIssueId(1);
						iBook.setBook(book);
						iBook.setIssuedDate(new Date());
				
						recordArr[totalRecords] = iBook;
						totalRecords++;
						
						System.out.println("---------------------------------------------------------------------------");
						System.out.println("Book Issued Successfully.!\n");
						System.out.println("---------------------------------------------------------------------------");
					}
					else {
						System.out.println("\nBook is Not Available At The Moment..\nSorry For The Inconvinience..!");
					}
				}
				else {
					System.out.println("Cannot Proceed futher..The is book Not Available.. ");
				}
					
			}
			else {
				System.out.println("Member Does NOT Exist..");
				System.out.println("Please Register Yourself to Issue The Book..!");
				System.out.println("1] Register\n2] Exit");
				int ch = sc.nextInt();
				if(ch == 1) {
					mInfo.addMember();
				}
				else {
					//back to main page
				}
			}
			
		}
		
		public void displayRecord() {
			
			System.out.println("\n------------------------------------------------------------------------------");
			System.out.println("**************************** Saraswati Library *****************************");
			System.out.println("------------------------------------------------------------------------------");
			
			for(int i=0; i<totalRecords; i++) {
				
				System.out.println("\n\tBook Isuued Id \t\t\t:\t\t"+recordArr[i].getIssueId());
				System.out.println("\tBook Isuued Date\t\t:\t\t"+recordArr[i].getIssuedDate());
				System.out.println("\t\t\t\t... Member Info ...");
				System.out.println("\tMember Id\t\t\t:\t\t"+recordArr[i].getMember().getMemberId());
				System.out.println("\tMember Name\t\t\t:\t\t"+recordArr[i].getMember().getMemeberName());
				System.out.println("\tMember Occupation\t\t:\t\t"+recordArr[i].getMember().getMemberOccupatuion());
				System.out.println("\tMember Date Of Birth\t\t:\t\t"+recordArr[i].getMember().getDob());
				System.out.println("\tMember Date Registration\t:\t\t"+recordArr[i].getMember().getRegisteredDt());
				System.out.println("\n\t\t\t\t... Book Info ...");
				System.out.println("\tBook Id\t\t\t\t:\t\t"+recordArr[i].getBook().getBookId());
				System.out.println("\tBook Name\t\t\t:\t\t"+recordArr[i].getBook().getBookName());
				System.out.println("\tBook Author\t\t\t:\t\t"+recordArr[i].getBook().getBookAuthor());
				System.out.println("\tBook Available Count\t\t:\t\t"+recordArr[i].getBook().getBookAvailableCnt());
				System.out.println("------------------------------------------------------------------------------------");
			}
		}
		
		public void displayRecord(IssueBook iBook) {
				
			System.out.println("\n------------------------------------------------------------------------------");
			System.out.println("**************************** Saraswati Library *****************************");
			System.out.println("------------------------------------------------------------------------------");
	
			System.out.println("\tBook Issue Id\t\t\t\t:\t\t"+iBook.getIssueId());
			System.out.println("\tBook Issued Date\t\t\t:\t\t"+iBook.getIssuedDate());
			System.out.println("\t\t\t... Member Info ...");
			System.out.println("\tMember Id\t\t\t:\t\t"+iBook.getMember().getMemberId());
			System.out.println("\tMember Name\t\t\t:\t\t"+iBook.getMember().getMemeberName());
			System.out.println("\tMember Occupation\t\t:\t\t"+iBook.getMember().getMemberOccupatuion());
			System.out.println("\tMember Date Of Birth\t\t:\t\t"+iBook.getMember().getDob());
			System.out.println("\tMember Date Registration\t:\t\t"+iBook.getMember().getRegisteredDt());
			System.out.println("\t\t\t... Book Info ...");
			System.out.println("\tBook Id\t\t\t:\t\t"+iBook.getBook().getBookId());
			System.out.println("\tBook Name\t\t:\t\t"+iBook.getBook().getBookName());
			System.out.println("\tBook Author\t\t:\t\t"+iBook.getBook().getBookAuthor());
			System.out.println("\tBook Available Count\t:\t\t"+iBook.getBook().getBookAvailableCnt());
			System.out.println("---------------------------------------------------------------------------------");
			
		}
		
		public IssueBook searchRecord() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter Book Issue/Record Id To Search Book : ");
			int id = sc.nextInt();
		
			IssueBook  iBook = null;
			for(int i=0; i<totalRecords; i++) {
				if(id == recordArr[i].getIssueId()) {
					return recordArr[i];
				}
			}
			return iBook;	
		}
}
