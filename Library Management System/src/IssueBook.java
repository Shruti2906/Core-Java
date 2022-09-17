import java.util.Date;

public class IssueBook {
	
	private int issueId;
	private Member member;
	private Book book;
	private Date issuedDate;
	
	public IssueBook() {
	
	}

	public IssueBook(int issueId, Member member, Book book, Date issuedDate) {
		super();
		this.issueId = issueId;
		this.member = member;
		this.book = book;
		this.issuedDate = issuedDate;
	}

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	
}
