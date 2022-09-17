
public class Address {
	
	private String city;
	private int pincode;
	private String state;
	private String country;
	
	
	public Address() {
	
	}

	public Address(String city, int pincode, String state, String country) {
	
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
