
import java.util.Scanner;

public class DivisibleFive {

	static Scanner input = new Scanner(System.in);

	public static void main (String[] args) {
		
		int user = 0;
		
		System.out.println("Determining numbers that are Divisible by 5");
		System.out.print("Enter a number => ");
		
		user = input.nextInt();
		
		if(user % 5 == 0) {
			System.out.println(user + " is divisible by 5.");
		}else {
			System.out.println(user + " is NOT divisible by 5.");
		}
		
		
	}
	
}

























