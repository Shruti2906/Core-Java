
public class Hotel {

	private String hotelSite;
	private String hotelName;
	private int bed;
	private int availableRooms;
	private double price;
	
	public Hotel() {
		super();
	}

	public Hotel(String hotelSite, String hotelName, int bed, int availableRooms, double price) {
		super();
		this.hotelSite = hotelSite;
		this.hotelName = hotelName;
		this.bed = bed;
		this.availableRooms = availableRooms;
		this.price = price;
	}

	public String getHotelSite() {
		return hotelSite;
	}

	public void setHotelSite(String hotelSite) {
		this.hotelSite = hotelSite;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getBed() {
		return bed;
	}

	public void setBed(int bed) {
		this.bed = bed;
	}

	public int getAvailableRooms() {
		return availableRooms;
	}

	public void setAvailableRooms(int availableRooms) {
		this.availableRooms = availableRooms;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
