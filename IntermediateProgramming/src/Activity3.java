import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of factorial => ");
		int x = input.nextInt();
		
		int i = factors(x);
		System.out.println(" is = " + i);

	}
	
	public static int factors(int n) {
		
		if(n != 0) {
			System.out.print(n);
			if(n!= 1) {
				System.out.print(" x ");
			}
			return n * factors(n-1);
		}
		else {
			return 1;
		}
		
	}
	
	public static int anotherWay(int n) {
		
		int result = n * (anotherWay(n-1));
		System.out.print(result);
		return result;

		
	}

}
