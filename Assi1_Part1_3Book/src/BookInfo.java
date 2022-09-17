
import java.util.Scanner;
public class BookInfo {
	
	public Book[] createBooks() {

		Scanner  sc =new Scanner(System.in);
	
		System.out.println("How many Books you want : ");
		int n  = sc.nextInt();
		Book arr[] = new Book[n];
		for(int i=0; i<n; i++) {
			Book b = new Book();
			System.out.println("Enter Book "+(i+1)+" Title : ");
			b.setBook_Title(sc.next());
			System.out.println("Enter Book "+(i+1)+" Price : ");
			b.setPrice(sc.nextFloat());
			arr[i] = b;
			
		}
		
		return arr;
	}
	
	public void showBooks(Book[] b) {
		
		System.out.println("\n\nBook Description");
		System.out.println("\nBook Title\t\tPrice");
		for(int i=0; i<b.length; i++) {

			System.out.println(b[i].getBook_Title()+"\t\t\t"+b[i].getPrice());
		}
		
	}

}
