import java.util.Scanner;

public class DynamicSales {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		do {
			DisplayItems();
			
			System.out.print("Enter Item Code => ");
			int ItemCode = input.nextInt();
			System.out.println();
			
			if(ItemCode > 0 && ItemCode < 4){
				TransactionProcess(ItemCode);
			}else {
				System.out.println("Invalid input! This transaction is cancelled.");
				System.out.println();
			}
		
		}while(NewTransaction() == 1);
		
		System.out.println();
		System.out.println("----------------------------");
		System.out.println("Thank you for shopping!");
		System.out.println("----------------------------");

	}
	
	public static int NewTransaction() {
		System.out.println("Do you want another transaction?");
		System.out.println("[1] Yes");
		System.out.println("[2] No");
		System.out.println("--------------------------------");
		
		System.out.print("Enter choice => ");
		int newTransac = input.nextInt();
		
		return newTransac;
		
	}
	
	final static int[] Code 		= {0, 		1, 			2, 			3}; 
	final static String[] Item 	= {"0", 	"Pencil", 	"Notebook", "Eraser"};
	final static double[] Price	= {0.0, 	20.00, 		40.00, 		10.00};
	
	public static void DisplayItems() {
		System.out.println("------------------------------------");
		System.out.println("Code \t Description \t Price");
		
		for(int x = 1; x < Code.length; x++) {
			System.out.println(Code[x] + " \t " + Item[x] + " \t Php " +  String.format("%,.2f", Price[x]));
		}
		System.out.println("------------------------------------");
		
	}
	
	
	public static void TransactionProcess(int ItemCode) {
		
		int tempCode = Code[ItemCode];
		String tempItem = Item[ItemCode];
		double tempPrice = Price[ItemCode];
		
		System.out.println("----------Item Description----------");
		System.out.println("Code  => " + tempCode);
		System.out.println("Item  => " + tempItem);
		System.out.println("Price => " + String.format("%,.2f", tempPrice));
		System.out.println("------------------------------------");
		
		System.out.print("Enter quantity => ");
		int quantity = input.nextInt();
		System.out.println();
		
		double TotalAmount = quantity * tempPrice;
		
		System.out.println("----------Receipt Description----------");
		System.out.println("Item          => " + tempItem);
		System.out.println("Price         => Php " + String.format("%,.2f", tempPrice));
		System.out.println("Quantity      => " + quantity);
		System.out.println("TOTAL AMOUNT  => Php " + String.format("%,.2f", TotalAmount));
		System.out.println("---------------------------------------");
		
		Billing(TotalAmount);
	}
	
	public static void Billing(double total) {
		double Cash = 0.0;
		System.out.print("Cash Tendered => ");
		Cash = input.nextDouble();
		
		if(total > Cash) {
			System.out.println("Sorry! Insufficient funds! Transaction is cancelled. Thank you!");
			System.out.println();
		}
		
		else {
			double change = Cash - total;
			System.out.println("Your change is => Php " + String.format("%,.2f", change));
			System.out.println("------------------------------------");
			System.out.println();
		}
		

	}
	
	
}


	// IDE - Integrated Development Environment







