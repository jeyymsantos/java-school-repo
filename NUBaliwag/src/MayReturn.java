import java.util.*;

public class MayReturn {

	public static void main(String[] args) {
		
		int num1, num2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number => ");
		num1 = input.nextInt();
		
		System.out.print("Enter second number => ");
		num2 = input.nextInt();
		
		int result;
		GetSum(num1, num2);
//		result = GetSum(num1, num2);
//		System.out.print(result);
	}
	
	public static void GetSum(int x, int y) {
		System.out.print(x+y);
	}

}
