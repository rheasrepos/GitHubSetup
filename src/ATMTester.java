
public class ATMTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM a = new ATM();
		a.deposit("Winfrey", 25159684372.43);
		a.deposit("Bezos", 193495330293.43);
		a.deposit("Bezos", 20394353.35);
		a.withdraw("Bezos", 3593293.66);
		a.deposit("MrTheiss",64033.55);
		a.withdraw("MrTheiss", 443964.46);
		System.out.println(a.checkBalance("Bezos"));
		System.out.println(a.checkBalance("Winfrey"));
		System.out.println(a.checkBalance("YoMama"));
		System.out.println(a.checkBalance("MrTheiss"));
		
	}

}
