
import java.util.Scanner;
public class ProductInfo {
	
	Scanner sc = new Scanner(System.in);
	public Product[] createProduct() {
		
		System.out.println("How many Products Do you Want : ");
		int n = sc.nextInt();
		Product pArr[] = new Product[n];
		for(int i=0; i<pArr.length; i++) {
			
			System.out.println("-------Enter Product "+(i+1)+" Details------");
			System.out.println("Enter Product Id, Name, Price, Quantity");
			Product p = new Product(sc.nextInt(), sc.next(), sc.nextFloat(), sc.nextInt());
			pArr[i] = p;
		}
		return pArr;
		
	}
	
	public void calculateProductBill(Product[] pArr) {
		
		for(int i=0; i<pArr.length; i++) {
			double total;
			double cgst;
			double sgst;
			double finalTotal;
			total = pArr[i].getProdPrice()*pArr[i].getProdQty();
			cgst = total*0.06;
			sgst = total*0.06;
			finalTotal = total+cgst+sgst;
			pArr[i].setTotal(total);
			pArr[i].setCgst(cgst);
			pArr[i].setSgst(sgst);
			pArr[i].setFinalTotal(finalTotal);
			
		}
		
	}
	public void displayProduct(Product[] pArr) {
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println("\n\t----------------------------- Product "+(i+1)+" ------------------------------");
			System.out.println("\t"+pArr[i].getpId()+"\t"+pArr[i].getpName()+"\t"+pArr[i].getProdPrice()+"\t"+pArr[i].getProdQty());
			System.out.println("\t--------------------------Product Bill--------------------------------");
			System.out.println("\tTotal : "+pArr[i].getTotal());
			System.out.println("\tCgst : "+pArr[i].getCgst());
			System.out.println("\tSgst : "+pArr[i].getSgst());
			System.out.println("\tFinal Total : "+pArr[i].getFinalTotal());
			
		}
		
	}
	

}
