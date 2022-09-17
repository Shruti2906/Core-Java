
import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BookInfo bInfo = new BookInfo();
		Book books[] = bInfo.createBooks();
		bInfo.showBooks(books);
		
	}

}
