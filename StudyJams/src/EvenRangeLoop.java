import java.util.Scanner;

public class EvenRangeLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter start => ");
		int start = input.nextInt();
		
		System.out.print("Enter end => ");
		int end = input.nextInt();
		
		System.out.printf("Even Numbers from %d to %d: \n", start, end);
		
		for(int x = start; x <= end; x++) {
			if(x % 2 == 0) {
				System.out.println(x);
			}
		}

	}

}
