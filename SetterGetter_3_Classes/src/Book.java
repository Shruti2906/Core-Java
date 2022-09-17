
public class Book {

	private int bId;
	private String bName;
	private float bPrice;
	private String bCategory;
	
	public Book() {
	
	}
	public Book(int bId, String bName, float bPrice, String bCategory) {
		
		this.bId = bId;
		this.bName = bName;
		this.bPrice = bPrice;
		this.bCategory = bCategory;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public float getbPrice() {
		return bPrice;
	}

	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}

	public String getbCategory() {
		return bCategory;
	}

	public void setbCategory(String bCategory) {
		this.bCategory = bCategory;
	}
	
	
	
	
}
