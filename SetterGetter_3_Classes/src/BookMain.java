

//This three classes approach...
//it improves modularity
//it makes easier to modify the code without disturbing other part of the code, readability increases
//scalability increases...
public class BookMain {

	public static void main(String[] args) {

		
		BookManager bm = new BookManager();
		
		Book b = bm.create();
		bm.display(b);

	}

}
