import java.util.Scanner;
public class BookInfo {
	
	static final int MaxBookCapacity = 100;
	static Book bookArr[] = new Book[MaxBookCapacity]; 
	static int totalBooksAvailable;
	
	public void addBook() {
		
		Scanner sc = new Scanner(System.in);
		int ch;
		String str;
		do {
			
			System.out.println("Enter Book Id : ");
			int id = sc.nextInt();
			System.out.println("Enter Book Name : ");
			String name = sc.next();
			System.out.println("Enter Book's Author : ");
			String author = sc.next();
			bookArr[totalBooksAvailable] = new Book(id, name, author);
			totalBooksAvailable++;
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Book Added Successfully.!\n");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Want to Add More Books(y/n) : ");
			str = sc.next();
					
		}while(str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes"));
		
	}
	
	public void displayBook() {
		
		System.out.println("****************************** Saraswati Library ******************************");
		System.out.println("------------------------------ Available Books --------------------------------");
		
		for(int i=0; i<totalBooksAvailable; i++) {
			System.out.println("\tBook Id\t\t\t:\t\t"+bookArr[i].getBookId());
			System.out.println("\tBook Name\t\t:\t\t"+bookArr[i].getBookName());
			System.out.println("\tBook Author\t\t:\t\t"+bookArr[i].getBookAuthor());
			System.out.println("\tBook Available Count\t:\t\t"+bookArr[i].getBookAvailableCnt());
			System.out.println("--------------------------------------------------------------------------------");
		}
	}
	
	public void displayBook(Book book) {
		
		System.out.println("****************************** Saraswati Library ******************************");
		System.out.println("--------------------------------- Book details --------------------------------");
		System.out.println("\tBook Id\t\t\t:\t\t"+book.getBookId());
		System.out.println("\tBook Name\t\t:\t\t"+book.getBookName());
		System.out.println("\tBook Author\t\t:\t\t"+book.getBookAuthor());
		System.out.println("\tBook Available Count\t:\t\t"+book.getBookAvailableCnt());
		System.out.println("--------------------------------------------------------------------------------");
	}
	
	public Book searchBook(int id) {
		
		Scanner sc = new Scanner(System.in);
		Book book = null;
		for(int i=0; i<totalBooksAvailable; i++) {
			if(id == bookArr[i].getBookId()) {
				return bookArr[i];
			}
		}
		return book;		
	}
}
