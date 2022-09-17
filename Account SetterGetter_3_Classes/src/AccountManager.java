
public class AccountManager {
	
	public Account create()
	{
		Account a = new Account(102,"Shruti",90000);
		return a;
	}
	public void display(Account a)
	{
		System.out.println("Account Id : "+a.getAccId());
		System.out.println("Account Holder Name : "+a.getAccHolderName());
		System.out.println("Account Balance : "+a.getAccBal());
		
	}

}
