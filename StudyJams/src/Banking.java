
import java.util.*;

public class Banking {

	static Scanner input = new Scanner(System.in);
	static double[] Users = {15000, 500, 0};
	static double amount = 0;
	static int user = -1;
	
	public static void main(String[] args) {
		
		System.out.print("Choose user => ");
		user = input.nextInt();
		user--;

		System.out.println("[1] Deposit");
		System.out.println("[2] Withdrawal");
		System.out.print("Enter choice => ");
		int choice = input.nextInt();
		
		if(choice == 1) {
			
			System.out.print("Enter amount (> 100) => ");
			amount = input.nextDouble();
			
			if(amount >= 100) {
				Users[user] += amount;
				System.out.println("Deposit successful!\nYour current balance is P" + Users[user]);
			}else {
				System.out.println("Amount is less than 100!");
			}
			
		}else if(choice == 2) {
			
			System.out.print("Enter amount (> 500) => ");
			amount = input.nextDouble();
			
			if(amount < 500 || amount > Users[user]) {
				System.out.println("Withdrawal amount is invalid!");
			}else {
				Users[user] -= amount;
				System.out.println("Withdrawal successful!\nYour current balance is P" + Users[user]);
			}
			
		}else {
			System.out.println("Invalid input!");
		}
		
		
	}

}



























