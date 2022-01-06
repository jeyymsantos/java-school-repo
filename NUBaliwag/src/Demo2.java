
import java.util.Scanner;

public class Demo2 {
	
	//DataType VariableName = Value
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Get 2 INPUTS from User then ADD and DISPLAY THE SUM
		
		int x, y, sum;
		
		System.out.print("Enter first number => ");
		x = input.nextInt();
		
		System.out.print("Enter second number => ");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println("The sum is " + sum);
		
	}
}
