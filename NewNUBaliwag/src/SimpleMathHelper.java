
import java.util.*;

public class SimpleMathHelper {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Simple Math Helper!\n");
		System.out.println("Select number of what would you like to calculate below:");
		
		System.out.println("[1] Square Root");
		System.out.println("[2] Logarithm");
		System.out.println("[3] Factorial");
		
		System.out.print("> ");
		String choice = input.nextLine();
		
		if(choice.equals("1")) {
			
			System.out.print("Enter number to square root => ");
			int x = input.nextInt();
			
			System.out.printf("The square root value of %d is => %.0f", x, Math.sqrt(x));
			
		}else if(choice.equals("2")) {
			
			System.out.print("Enter number to logarithm => ");
			int x = input.nextInt();
			
			System.out.printf("The logarithm value of %d is => %.0f", x, Math.log(x));
			
		}else if(choice.equals("3")) {
			System.out.print("Enter number to factorial => ");
			int x = input.nextInt();
			
			int factorial = 1;
			for(int y = 1; y <= x; y++) {
				factorial = factorial * y;
			}
			
			System.out.printf("The factorial value of %d is => %d", x, factorial);
		}else {
			System.out.println("Invalid input! Program is terminated.");
		}

	}

}
