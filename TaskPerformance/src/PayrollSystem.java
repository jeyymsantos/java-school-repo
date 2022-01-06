import java.util.*;
public class PayrollSystem {
	
	public static void main(String[] args) {
		
		String exit = "", choice = "";
		boolean anotherTransact = false;
		
		do { 

			String type; 
			System.out.print("Enter name of Employee => " );
			Scanner input = new Scanner(System.in);
			String name = input.nextLine();
		
			boolean loop = true;
			do {	
				type = EmployeeType(name);	
				
				if(type.equals("P") || type.equals("F")) {
					 loop = false;
				}
				
			}while(loop == true);
	
			String transact = ContinueTransaction();
			anotherTransact = true;
			
			if(transact.equals("N")) {
				anotherTransact = false;
			}
			
		}while(anotherTransact == true);
	}
	
	public static String ContinueTransaction() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n[Y] Yes " );
		System.out.println("[N] No \n" );
		
		System.out.print("Do you want another transaction? => " );
		String choice = input.nextLine();
		
		if(choice.equals("Y")) {
			System.out.println();
			System.out.println("-----------------");
			return "Y";
		}else if(choice.equals("N")) {
			System.out.println();
			System.out.println("-----------------");
			System.out.println("Thank you!");
			System.out.println("-----------------");
			return "N";
		}else {
			System.out.println("Invalid Input");
			return "Invalid";
		}
	}
	
	public static String EmployeeType(String name) {
		String choice = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("[P] Part-Time Employee " );
		System.out.println("[F] Full-Time Employee \n" );
		
		System.out.print("Enter choice => " );
		choice = input.nextLine();
		
		if(choice.equals("P")) 		{PartTime(name);}
		else if(choice.equals("F")) {FullTime(name);}
		else 						
			{
				System.out.println("\n--------------");
				System.out.println("Invalid Input!");
				System.out.println("--------------\n");
			}
		
		return choice;
		
	}
	
	public static void PartTime(String name) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println("------------------------");
		System.out.println("   Part-Time Employee");
		System.out.println("------------------------");
		
		System.out.print("Enter rate per hour     => " );
		double ratePerHour = input.nextDouble();
		
		System.out.print("Enter # of hours worked => " );
		double noOfHoursWorked = input.nextDouble();
		
		System.out.print("Enter # of hours overtime => " );
		double noOfHoursOvertime = input.nextDouble();
		
		double basicPay = ratePerHour * noOfHoursWorked;
		double overtimePay = noOfHoursOvertime * (ratePerHour * 0.15);
		double grossPay = basicPay + overtimePay;
		
		System.out.println();
		System.out.println("Employee Name : " + name);
		System.out.println("Basic Pay     : " + String.format("Php %,.2f", basicPay));
		System.out.println("Overtime Pay  : " + String.format("Php %,.2f", overtimePay));
		System.out.println("------------------------------------");
		System.out.println("Gross Pay     : " + String.format("Php %,.2f", grossPay));
	}
	
	public static void FullTime(String name) {
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println("------------------------");
		System.out.println("   Full-Time Employee");
		System.out.println("------------------------");
		System.out.print("Enter basic pay => " );
		
		double pay = input.nextDouble();
		
		System.out.println();
		System.out.println("Employee Name : " + name);
		System.out.println("Basic Pay     : " + String.format("Php %,.2f", pay));
		
	}

}
