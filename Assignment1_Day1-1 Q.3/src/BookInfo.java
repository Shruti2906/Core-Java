import java.util.Scanner;

public class BookInfo {
	
	Scanner sc = new Scanner(System.in);
	
	public Book[] createBooks() {

		System.out.println("How many books do you want : ");
		int n = sc.nextInt();
		Book book[] = new Book[n];
		for(int i=0; i<n; i++) {
			Book b = new Book();
			System.out.println("Enter Book Title : ");
			b.setBook_Title(sc.next());
			System.out.println("Enter Book Price : ");
			b.setBook_Price(sc.nextInt());
			book[i] = b;
		}
		
		return book;
	}
	
	public void showBooks(Book[] books) {
		
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("Book Title\t\tBook Price");
		for(int i=0; i<books.length; i++) {
			System.out.println("------------------------------------------------------------------");
			System.out.println(books[i].getBook_Title()+"\t\t"+books[i].getBook_Price());
		}
	}

}
