
import java.util.Scanner;

public class CalculationThruMethods {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Compute();
	}
	
	
	public static void Compute() {
		
		int[] values = new int[2];
		
		System.out.print("Enter first number  => ");
		values[0] = input.nextInt();
		
		System.out.print("Enter second number => ");
		values[1] = input.nextInt();
		
		Addition(values);
		Subtraction(values);
		Multiplication(values);
		Division(values);
		
	}
	
	public static void Addition(int values[]) {
		System.out.printf("The sum of %d + %d = %d\n", values[0], values[1], values[0]+values[1]);
	}
	
	public static void Subtraction(int values[]) {
		System.out.printf("The difference of %d - %d = %d\n", values[0], values[1], values[0]-values[1]);
	}
	
	public static void Multiplication(int values[]) {
		System.out.printf("The product of %d * %d = %d\n", values[0], values[1], values[0]*values[1]);
	}
	
	public static void Division(int values[]) {
		System.out.printf("The quotient of %d / %d = %d\n", values[0], values[1], values[0]/values[1]);
	}
	
}
