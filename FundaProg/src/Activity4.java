import java.util.Scanner;
public class Activity4 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numEntry;
		int total = 0;
		int grades[] = {87, 40, 77, 89, 58, 64, 95, 83, 72, 90};
		
		System.out.println("=====================================");
		System.out.println("ARRAY-BASED GRADE AVERAGE COMPUTATION");
		System.out.println("=====================================\n");
		
		System.out.print("Enter array length [1-10] => ");
		numEntry = input.nextInt();
		if(numEntry > grades.length) {
			System.out.print("Invalid Entry");
		}
		else {
			for(int i = 0; i < numEntry; i++) {
				System.out.printf("Grade %d = %d \n", i+1, grades[i]);
				total += grades[i];
			}

			total /= numEntry;
			System.out.println("=====================================");
			System.out.println("The average is => " + total);
			
			if(total >= 75) {
				System.out.print("You are PASSED");
			}else {
				System.out.print("You are FAILED");
			}
		}
	}
}

	