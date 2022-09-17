
//This three classes approach...
//it improves modularity
//it makes easier to modify the code without disturbing other part of the code,
//readability increases -  program gets easier to understand
//scalability increases...
public class AccountMain {

	public static void main(String[] args) {
	
		AccountManager accM = new AccountManager();
		Account a = accM.create();
		accM.display(a);

	}

}
