
import java.util.Scanner;
public class BasicOperation {

	static Scanner scan = new Scanner (System.in);
	static int userNum, transNum, deposit, withdrawal, result, choice;
	
	public static void main(String[] args) {
		
		int User1Bal = 15000, User2Bal = 250, User3Bal = 0;
		
		do {
		System.out.print("Enter User Number: ");
		userNum = scan.nextInt();
			if (userNum == 1) {
				User1Bank (User1Bal);
			}
			else if (userNum == 2) {
				User2Bank (User2Bal);
			}
			else if (userNum == 3) {
				User3Bank (User3Bal);
			}
			else {
				System.out.println("\nSorry, you have entered an INVALID User Number!");
			}
		
		System.out.print("\nWould you like another transaction? 1-Yes; 2-No: ");
		choice = scan.nextInt();
		System.out.println("\n---------------------------------------------------\n");
		
		} while (choice == 1);

		System.out.println("Thank you. Have a good day!");
		
	}

	public static void User1Bank (int User1Bal) {
		System.out.println("\n[1] - Check Balance\n[2] - Deposit\n[3] - Withdrawal");
		System.out.print("Enter choice: ");
		transNum = scan.nextInt();
			if (transNum == 1) {
				System.out.println("\nCurrent Balance: P" + User1Bal);
			}
			
			if (transNum == 2) {
				System.out.println("\nNOTE: Deposit MUST be above 100 Pesos.");
				System.out.print("Enter Amount to Deposit: ");
				deposit = scan.nextInt();
					if (deposit <= 100) {
						System.out.println("\nTransaction Failed! You have entered an INVALID amount.");
					}
					else {
						result = User1Bal + deposit;
						System.out.println("\nTransaction Complete.\nCurrent Balance: P" + result);
					}
			}
			
			if (transNum == 3) {
				System.out.println("\nNOTE: Withdrawal MUST be above 500 Pesos.");
				System.out.print("Enter Amount to Withdraw: ");
				withdrawal = scan.nextInt();
					if (withdrawal <= 500) {
						System.out.println("\nTransaction Failed! You have entered an INVALID amount.");
					}
					else if (withdrawal > 500 && withdrawal <= User1Bal){
						result = User1Bal - withdrawal;
						System.out.println("\nTransaction Complete.\nCurrent Balance: P" + result);
					}
					else if (withdrawal > User1Bal) {
						System.out.println("\nSorry, you have insufficient balance.");
					}
			}
	}
	
	public static void User2Bank (int User2Bal) {
		System.out.println("\n[1] - Check Balance\n[2] - Deposit\n[3] - Withdrawal");
		System.out.print("Enter choice: ");
		transNum = scan.nextInt();
			if (transNum == 1) {
				System.out.println("\nCurrent Balance: P" + User2Bal);
			}
			
			if (transNum == 2) {
				System.out.println("\nNOTE: Deposit MUST be above 100 Pesos.");
				System.out.print("Enter Amount to Deposit: ");
				deposit = scan.nextInt();
					if (deposit <= 100) {
						System.out.println("\nTransaction Failed! You have entered an INVALID amount.");
					}
					else {
						result = User2Bal + deposit;
						System.out.println("\nTransaction Complete.\nCurrent Balance: P" + result);
					}
			}
			
			if (transNum == 3) {
				System.out.println("\nNOTE: Withdrawal MUST be above 500 Pesos.");
				System.out.print("Enter Amount to Withdraw: ");
				withdrawal = scan.nextInt();
					if (withdrawal <= 500) {
						System.out.println("\nTransaction Failed! You have entered an INVALID amount.");
					}
					else if (withdrawal > 500 && withdrawal <= User2Bal){
						result = User2Bal - withdrawal;
						System.out.println("\nTransaction Complete.\nCurrent Balance: P" + result);
					}
					else if (withdrawal > User2Bal) {
						System.out.println("\nSorry, you have insufficient balance.");
					}
			}
	}
	
	public static void User3Bank (int User3Bal) {
		System.out.println("\n[1] - Check Balance\n[2] - Deposit\n[3] - Withdrawal");
		System.out.print("Enter choice: ");
		transNum = scan.nextInt();
			if (transNum == 1) {
				System.out.println("\nCurrent Balance: P" + User3Bal);
			}
			
			if (transNum == 2) {
				System.out.println("\nNOTE: Deposit MUST be above 100 Pesos.");
				System.out.print("Enter Amount to Deposit: ");
				deposit = scan.nextInt();
					if (deposit <= 100) {
						System.out.println("\nTransaction Failed! You have entered an INVALID amount.");
					}
					else {
						result = User3Bal + deposit;
						System.out.println("\nTransaction Complete.\nCurrent Balance: P" + result);
					}
			}
			
			if (transNum == 3) {
				System.out.println("\nNOTE: Withdrawal MUST be above 500 Pesos.");
				System.out.print("Enter Amount to Withdraw: ");
				withdrawal = scan.nextInt();
					if (withdrawal <= 500) {
						System.out.println("\nTransaction Failed! You have entered an INVALID amount.");
					}
					else if (withdrawal > 500 && withdrawal <= User3Bal){
						result = User3Bal - withdrawal;
						System.out.println("\nTransaction Complete.\nCurrent Balance: P" + result);
					}
					else if (withdrawal > User3Bal) {
						System.out.println("\nSorry, you have insufficient balance.");
					}
			}
	}
	
}
