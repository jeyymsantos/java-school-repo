
import java.util.Scanner;

public class BasicOperations {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Enter first number => ");
		num1 = input.nextInt();
		
		System.out.print("Enter second number => ");
		num2 = input.nextInt();
		
		DisplaySum(num1, num2);
		DisplayDifference(num1, num2);
		DisplayProduct(num1, num2);
		DisplayQuotient(num1, num2);
	}
	
	public static void DisplaySum(int first, int second) {
		System.out.println("The sum is " + (first + second));
	}
	
	public static void DisplayDifference(int first, int second) {
		System.out.println("The difference is " + (first - second));
	}

	public static void DisplayProduct(int first, int second) {
		System.out.println("The product is " + (first * second));
	}
	
	public static void DisplayQuotient(int first, int second) {
		System.out.println("The quotient is " + (first / second));
	}
}
