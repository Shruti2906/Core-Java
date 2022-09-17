
import java.util.*;

public class ProdMain {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			Product pobj = new Product();
			
			System.out.println("Enter Product Id : ");
			pobj.setProdId(sc.nextInt());
			System.out.println("Enter Product Name : ");
			pobj.setProdName(sc.next());
			System.out.println("Enter Product Quantity : ");
			pobj.setProdQty(sc.nextInt());
			System.out.println("Enter Product Price : ");
			pobj.setProdPrice(sc.nextDouble());
			
			//calculations
			double total = pobj.getProdQty()*pobj.getProdPrice();
			double cgst = total*0.06;
			double sgst = total*0.06;
			double finalTotal = total+cgst+sgst;
			
			pobj.setProdTotal(total);
			pobj.setCgst(cgst);
			pobj.setSgst(sgst);
			pobj.setFinalTotal(finalTotal);
			
			//display
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Product Id\t\t:\t\t"+pobj.getProdId());
			System.out.println("Product name\t\t:\t\t"+pobj.getProdName());
			System.out.println("Product Qty\t\t:\t\t"+pobj.getProdQty());
			System.out.println("Product Total\t\t:\t\t"+pobj.getProdTotal());
			System.out.println("Product Cgst\t\t:\t\t"+pobj.getCgst());
			System.out.println("Product Sgst\t\t:\t\t"+pobj.getSgst());
			System.out.println("Product Final Total\t:\t\t"+pobj.getFinalTotal());
			System.out.println("------------------------------------------------------------------------");
		
	}

}
//student marksheet