
public class AccMain {

	public static void main(String[] args) {
		
		Account a = new Account();
		a.setAccNo(101);
		a.setAccName("John");
		a.setBal(10000);
		
		System.out.println("=================== Display ===============");
		
		System.out.println("Account No : "+a.getAccNo());
		System.out.println("Account Holder Name : "+a.getAccName());
		System.out.println("Account Balance : "+a.getBal());
		
		

	}

}
