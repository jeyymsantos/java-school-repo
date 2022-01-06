
import java.util.Scanner;

public class Grading {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int user = 0;
		
		System.out.println("Determining Grade from Input");
		System.out.println("98 - 100    = With Highest Honors");
		System.out.println("95 - 97     = With High Honors");
		System.out.println("90 - 94     = With Honors");
		System.out.println("86 - 89     = Outstanding");
		System.out.println("83 - 85     = Excellent");
		System.out.println("80 - 82     = Very Good");
		System.out.println("75 - 79     = Good");
		System.out.println("60 - 74     = Fail");
		
		System.out.print("Enter a grade => ");
		user = input.nextInt();

		if(user > 100 || user < 60) {
			System.out.println(user + " is not a VALID GRADE");
		}else if(user >= 98) {
			System.out.println(user + " is With Highest Honors");
		}else if(user >= 95) {
			System.out.println(user + " is With High Honors");
		}else if(user >= 90) {
			System.out.println(user + " is With Honors");
		}else if(user >= 86) {
			System.out.println(user + " is Outstanding");
		}else if(user >= 83) {
			System.out.println(user + " is Excellent");
		}else if(user >= 80) {
			System.out.println(user + " is Very Good");
		}else if(user >= 75) {
			System.out.println(user + " is Good");
		}else if(user >= 60) {
			System.out.println(user + " is Fail");
		}
		
		// Syntax Error
		// RunTime Error
		// Logical Error

	}
	
}