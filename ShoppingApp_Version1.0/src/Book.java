
public class Book extends Product {

	private String bookAuthor;
	private String bookGenere;
	private String bookPublication;
	
	public Book() {
		super();
	}

	public Book(int prodId, String prodName, double prodPrice, int prodQty, String bookAuthor, String bookGenere, String bookPublication) {
		super(prodId, prodName, prodPrice, prodQty);
		this.bookAuthor = bookAuthor;
		this.bookGenere = bookGenere;
		this.bookPublication = bookPublication;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookGenere() {
		return bookGenere;
	}

	public void setBookGenere(String bookGenere) {
		this.bookGenere = bookGenere;
	}

	public String getBookPublication() {
		return bookPublication;
	}

	public void setBookPublication(String bookPublication) {
		this.bookPublication = bookPublication;
	}
	
	
}
