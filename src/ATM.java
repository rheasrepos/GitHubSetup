
public class ATM {

	private String accountID;
	private long total = 0;
	
	public ATM(String accountID) {
		this.accountID = accountID;
	}
	
	public ATM(){
			accountID = "myIDABC";
		
	}

	public void deposit(int ID, long deposit ) {
		total += deposit;

	}
	
	public long presentTotal() {
		return total;
	}
}
