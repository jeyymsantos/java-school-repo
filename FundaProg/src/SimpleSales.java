import java.util.Scanner;

public class SimpleSales {
	
	static Scanner input = new Scanner(System.in);
	
	final static double Pencil = 20.00;
	final static double Notebook = 40.00;
	final static double Eraser = 10.00;
	
	
	public static void main(String[] args) {
		
		do {
			DisplayItems();
			
			int ItemCode = 0;
			System.out.print("Enter Item Code => ");
			ItemCode = input.nextInt();
			System.out.println();
			
			if(ItemCode == 1) {
				Pencil();
			}else if(ItemCode == 2) {
				Notebook();
			}else if(ItemCode == 3) {
				Eraser();
			}else {
				System.out.println("Invalid input! Please try again!");
			}
		}while(NewTransaction() == 1);
		
		System.out.println();
		System.out.println("----------------------------");
		System.out.println("Thank you for shopping!");
		System.out.println("----------------------------");
	}
	
	public static int NewTransaction() {
		System.out.println("Do you want to buy another item?");
		System.out.println("[1] Yes");
		System.out.println("[2] No");
		System.out.println("--------------------------------");
		
		System.out.print("Enter choice => ");
		int newTransac = input.nextInt();
		
		return newTransac;
		
	}
	
	public static int GetQuantity() {
		
		int quantity = 0;
		
		System.out.print("Enter quantity => ");
		quantity = input.nextInt();
		
		return quantity;
		
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
			System.out.println("Your change is => Php " + (Cash - total));
			System.out.println("------------------------------------");
			System.out.println();
		}
		

	}
	
	
	
	public static void DisplayItems() {
		System.out.println("------------------------------------");
		System.out.println("Code \t Description \t Price");
		System.out.println("1 \t Pencil \t Php 20.00");
		System.out.println("2 \t Notebook \t Php 40.00");
		System.out.println("3 \t Eraser \t Php 10.00");
		System.out.println("------------------------------------");
		
	}
	
	
	public static void Pencil() {
		System.out.println("----------Item Description----------");
		System.out.println("Code \t Description \t Price");
		System.out.println("1 \t Pencil \t Php 20.00");
		System.out.println("------------------------------------");
		
		int quantity = GetQuantity();
		
		System.out.println("----------Receipt Description----------");
		System.out.println("Item \t Price \t\t Quantity \t TOTAL");
		System.out.println("Pencil \t Php 20.00 \t " + quantity + "\t\t Php " + quantity * Pencil);
		System.out.println("---------------------------------------");
		
		Billing(quantity * Pencil);
		
	}
	
	public static void Notebook() {
		System.out.println("----------Item Description----------");
		System.out.println("Code \t Description \t Price");
		System.out.println("2 \t Notebook \t Php 40.00");
		System.out.println("------------------------------------");
		
		int quantity = GetQuantity();
		
		System.out.println("----------Receipt Description----------");
		System.out.println("Item \t\t Price \t\t Quantity \t TOTAL");
		System.out.println("Notebook \t Php 40.00 \t " + quantity + "\t\t Php " + quantity * Notebook);
		System.out.println("---------------------------------------");
		
		Billing(quantity * Notebook);
	}

	public static void Eraser() {
		System.out.println("----------Item Description----------");
		System.out.println("Code \t Description \t Price");
		System.out.println("3 \t Eraser \t Php 10.00");
		System.out.println("------------------------------------");
		int quantity = GetQuantity();
		
		System.out.println("----------Receipt Description----------");
		System.out.println("Item \t Price \t\t Quantity \t TOTAL");
		System.out.println("Eraser \t Php 10.00 \t " + quantity + "\t\t Php " + quantity * Eraser);
		System.out.println("---------------------------------------");
		
		Billing(quantity * Eraser);
	}
	
	
}
