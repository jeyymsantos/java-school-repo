import java.util.Scanner;

public class Operations {

	public static void main(String[] Jeyym) {
	
		// Write a program that will allow the user
		// to enter a number from 1-10;
		// Then, create a multiplication table (1-10);
		
		// SAMPLE OUTPUT
		// Enter a number = 10
		// 10 x 1 = 10
		// 10 x 2 = 20
		// ....
		// 10 x 10 = 100
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number => ");
		int num = input.nextInt();

		if(num >= 1 && num <= 10) {
			
			
			
			
			
			
			for(int value = 1; value <= 10; value++) {
				System.out.println(num + " x " + value + " = " + (value*num));
			}
			
			
			
			
			
			
			
			
			
		}
		
		else {
			System.out.println("Invalid Input! 1-10 only!");
		}
	}
}
