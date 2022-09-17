
public class BookMain {

	public static void main(String[] args) {
	
		Book b[];
		BookInfo bInfo = new BookInfo();
		b = bInfo.createBooks();
		bInfo.showBooks(b);
		
	}

}
