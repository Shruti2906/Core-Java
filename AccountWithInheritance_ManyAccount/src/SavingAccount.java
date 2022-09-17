
public class SavingAccount extends Account{
	
	static private float interestRate;

	static {
		interestRate = 2;
	}
	
	public SavingAccount() {	//do nothing constructor 
		
	}

	public SavingAccount(int accNo, String accType, double accBal) {
	
		super(accNo, accType, accBal);
		
		//this();	 //this should be the first line in constructor 
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		SavingAccount.interestRate = interestRate;
	}
	
	/*@Override
	public String toString() {
		return getAccNo()+"\t"+getAccName()+"\t"+getBal();
	}*/
	
}
