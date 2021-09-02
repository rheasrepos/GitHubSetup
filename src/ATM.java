
import java.util.*;
import javax.swing.*;


public class ATM {

	private HashMap<String, Double> account;
	
	public ATM() {
		account = new HashMap<String, Double>();
	}

	public void deposit(String ID, Double deposit ) {
		if(deposit<0)
			return;
		if(!account.containsKey(ID)){
			account.put(ID, deposit);
			System.out.println("User "+ID+" deposited $"+deposit);
			return;
		}
		account.put(ID, account.get(ID) + deposit);//this is the same as replace, will map to exisiting key not create new one
		
		System.out.println("User "+ID+" deposited $"+deposit);

	}
	public void withdraw(String ID, Double money)
	{
		if(!account.containsKey(ID))
		{
			System.out.println("Error: Account "+ID +" not found");
			return;
		}
		if(account.get(ID)<money)
		{
			System.out.println("Not enough in your balance, User "+ID);
			return;
		}
		account.put(ID, account.get(ID)-money);
		System.out.println("User "+ID+" withdrew $"+money);
	}
	public String checkBalance(String ID)
	{
		if(!account.containsKey(ID))
			return "Error: Account "+ID +" not found";
		return "User " +ID+" - balance: $"+account.get(ID);
		
		
	}
	
	
	/*
	public static void main (String []args) {
		ATM user = new ATM();
		Double deposit;
		
		String yesNo = JOptionPane.showInputDialog("Do you have a transaction to make? y or n");
		while(yesNo.equals("y")) {
			
			String inputBox = JOptionPane.showInputDialog("Input your deposit amount ");
			deposit = Double.parseDouble(inputBox);
			
	        String accntName = JOptionPane.showInputDialog("What's your account name, 0 if you don't have one");
	      
	        
			if(accntName.equals( "0")) {
				accntName = "newAccnt" +  deposit + (int)Math.random()*10;
			}
			user.deposit(accntName, deposit);
			JOptionPane.showMessageDialog(null, "OK " + accntName + " your balance is " + user.account.get(accntName));
			
			 yesNo = JOptionPane.showInputDialog("Do you have a transaction to make? y or n");

			
			}
		
			JOptionPane.showMessageDialog(null, "Byeeee");			
		}
		*/
		
		
		
	}
	
	

