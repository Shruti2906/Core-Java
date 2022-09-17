
public class BookManager {

	public Book create()
	{
		
		Book b = new Book(101,"Java",500,"Technical" );
		
		return b;
	}
	public void display(Book b)
	{
		
		System.out.println("Book Id : "+b.getbId());
		System.out.println("Book Name : "+b.getbName());
		System.out.println("Book Price : "+b.getbPrice());
		System.out.println("Book Category : "+b.getbCategory());
		
		
	}
	
	
}
