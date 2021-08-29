
import java.util.*;
import javax.swing.*;


public class ATM {

	private HashMap<String, Double> account;
	
	public ATM() {
		account = new HashMap<String, Double>();
	}

	public String deposit(String ID, Double deposit ) {
		
		if(!account.containsKey(ID)){
			account.put(ID, deposit);
			return ID;
		}
		account.replace(ID, account.get(ID) + deposit);

		return ID;
	}
	
	
	
	public static void main (String []args) {
		ATM user = new ATM();
		Double deposit;
		
		String yesNo = JOptionPane.showInputDialog("Do you have a transaction to make? y or n");
		while(yesNo.equals("y")) {
			
			String inputBox = JOptionPane.showInputDialog("Input your deposit amount ");
			deposit = Double.parseDouble(inputBox);
			
	        String accntName = JOptionPane.showInputDialog("What's your account number, 0 if you don't have one");
	      
	        
			if(accntName.equals( "0")) {
				accntName = "newAccnt" +  deposit + (int)Math.random()*10;
			}
			user.deposit(accntName, deposit);
			JOptionPane.showMessageDialog(null, "OK " + accntName + " your balance is " + user.account.get(accntName));
			
			 yesNo = JOptionPane.showInputDialog("Do you have a transaction to make? y or n");

			
			}
		
			JOptionPane.showMessageDialog(null, "Byeeee");
		
			
		}
		
		
		
	}
	
	

