
public class HotelData {
	private String hotelName;
	private int roomType;
	private int noRooms;
	private double price;
	public HotelData(String hotelName, int roomType, int noRooms, double price) {
		super();
		this.hotelName = hotelName;
		this.roomType = roomType;
		this.noRooms = noRooms;
		this.price = price;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRoomType() {
		return roomType;
	}
	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}
	public int getNoRooms() {
		return noRooms;
	}
	public void setNoRooms(int noRooms) {
		this.noRooms = noRooms;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
