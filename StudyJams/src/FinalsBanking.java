
import java.util.*;

public class FinalsBanking {
	
	static Scanner input = new Scanner(System.in);
	static String PIN = "123456", tempPIN;
	static double Balance = 10000;
	
	public static void main(String[] args) {
		System.out.print("Enter a PIN => ");
		tempPIN = input.nextLine();
		
		if(PIN.equals(tempPIN)) {
			Banking();
		}else {
			System.out.println("Invalid PIN! Program is terminated.");
		}

	}
	
	public static void Banking() {
		
		int transaction = 2;
		do {
			input = new Scanner(System.in);
			
			Transaction();
			 System.out.println("\nDo you want another transaction?");
			 System.out.println("[1] Yes");
			 System.out.println("[2] No");
			 System.out.print("Select a choice => ");
			 transaction = input.nextInt(); 
		}while(transaction == 1);
		
		System.out.println("Thank you for using our service! \nProgram is terminated.");
	}
	
	public static void Transaction() {
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("ABC Bank of Commerce");
		System.out.println("[1] Balance Inquiry");
		System.out.println("[2] Deposit");
		System.out.println("[3] Withdrawals \n");
		
		System.out.print("Select a transaction => ");
		String choice = input.nextLine();
		
		if(choice.equals("1")) {
			
			System.out.println("Your current balance is => P" + String.format("%,.2f", Balance));
		
		}else if(choice.equals("2")) {
			System.out.print("Enter amount to deposit => ");
			double Deposit = input.nextDouble();
			Balance += Deposit;
			System.out.println("Your new current balance is => P" + String.format("%,.2f", Balance));

		}else if(choice.equals("3")) {
			System.out.print("Enter amount to withdraw => ");
			double Withdraw = input.nextDouble();
			
			if(Withdraw > Balance) {
				System.out.println("Insufficient Funds!");
			}else {
				Balance -= Withdraw;
				System.out.println("Your new current balance is => P" + String.format("%,.2f", Balance));
			}
		}else {
			System.out.println("Invalid transaction choice!");
		}
	}

}
