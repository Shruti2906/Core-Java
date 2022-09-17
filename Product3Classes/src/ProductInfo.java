
import java.util.Scanner;

public class ProductInfo {
	
	Scanner sc = new Scanner(System.in);
	
	public Product[] create() {
	
		System.out.println("How many products do you want : ");
		int n = sc.nextInt();
		Product pArr[] = new Product[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("*** Product "+(i+1)+" ***");
			System.out.println("Enter product id, name, price, quantity : ");
			pArr[i] = new Product(sc.nextInt(), sc.next(), sc.nextFloat(), sc.nextInt());
			
		}
		return pArr;
		
	}
	
	public void calculate(Product[] pArr) {
	
		for(int i=0; i<pArr.length; i++) {
			double total = 0;
			double cgst = 0;
			double sgst = 0;
			double finalTotal = 0;
			total = pArr[i].getProdPrice()*pArr[i].getProdQty();
			cgst = total*0.06;
			sgst = total*0.06;
			finalTotal = cgst+sgst+total;
			pArr[i].setTotal(total);
			pArr[i].setCgst(cgst);
			pArr[i].setSgst(sgst);
			pArr[i].setFinalTotal(finalTotal);
			
		}
					 
	}
	
	public void display(Product[] pArr) {
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println("------- Product "+(i+1)+"details -------");
			System.out.println(pArr[i].getProdId()+"\t"+pArr[i].getProdName()+"\t"+pArr[i].getProdPrice()+"\t"+pArr[i].getProdQty());
			System.out.println("------------------------------------- Product Bill --------------------------------------");
			System.out.println("Product Total : "+pArr[i].getTotal());
			System.out.println("Product Cgst : "+pArr[i].getCgst());
			System.out.println("Product Sgst : "+pArr[i].getSgst());
			System.out.println("Product Final Total : "+pArr[i].getFinalTotal());
			System.out.println("===========================================================================================");
		}
	}

}
