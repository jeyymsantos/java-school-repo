import java.util.*;

public class SalaryComputation {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] Jeyym) {

		System.out.println("SIMPLE SALARY COMPUTATION APPLICATION");
		
		String name = getName();
		int daysWorked = getDaysWorked();
		double ratePerDay = getRatePerDay();
		double grossPay = getGrossPay(daysWorked, ratePerDay);
		
		DisplayGrossPay(name, grossPay);

	}
	
	public static String getName() {
		System.out.print("Enter name of employee      => ");
		String name = input.nextLine();
		return name;
	}
	
	public static int getDaysWorked() {
		System.out.print("Enter number of days worked => ");
		int daysWorked = input.nextInt();
		return daysWorked;
	}
	
	public static double getRatePerDay() {
		System.out.print("Enter rate per day          => ");
		double ratePerDay = input.nextDouble();
		return ratePerDay;
	}
	
	public static double getGrossPay(int daysWorked, double ratePerDay) {
		double grossPay = daysWorked * ratePerDay;
		return grossPay;
	}
	
	public static void DisplayGrossPay(String name, double grossPay) {
		System.out.println("\nHi " + name + "! Your gross pay is:");
		System.out.println("Php " + String.format("%,.2f", grossPay));
	}
	
}
