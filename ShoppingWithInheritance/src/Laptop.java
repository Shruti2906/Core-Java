
public class Laptop extends Product{

	private float laptopHDDCapacity;
	private String laptopOs;
	private String laptopCPU;
	private int laptopRam;
	
	public Laptop() {
		super();
	}

	public Laptop(int prodId, String prodName, double prodPrice, int prodQty, float laptopHDDCapacity, String laptopOs, String laptopCPU, int laptopRam) {
		super( prodId, prodName, prodPrice, prodQty);
		this.laptopHDDCapacity = laptopHDDCapacity;
		this.laptopOs = laptopOs;
		this.laptopCPU = laptopCPU;
		this.laptopRam = laptopRam;
	}

	public float getLaptopHDDCapacity() {
		return laptopHDDCapacity;
	}

	public void setLaptopHDDCapacity(float laptopHDDCapacity) {
		this.laptopHDDCapacity = laptopHDDCapacity;
	}

	public String getLaptopOs() {
		return laptopOs;
	}

	public void setLaptopOs(String laptopOs) {
		this.laptopOs = laptopOs;
	}

	public String getLaptopCPU() {
		return laptopCPU;
	}

	public void setLaptopCPU(String laptopCPU) {
		this.laptopCPU = laptopCPU;
	}

	public int getLaptopRam() {
		return laptopRam;
	}

	public void setLaptopRam(int laptopRam) {
		this.laptopRam = laptopRam;
	}
	
}
