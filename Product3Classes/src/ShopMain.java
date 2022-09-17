
public class ShopMain {

	public static void main(String[] args) {

		ProductInfo pInfo = new ProductInfo();
		
		Product pArr[] = pInfo.create();
		pInfo.calculate(pArr);
		pInfo.display(pArr);
		
	}

}
