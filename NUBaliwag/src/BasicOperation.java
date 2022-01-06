import java.util.*;

public class BasicOperation {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num1, num2, operation;
		String name;	
		
		System.out.print("Enter your name => ");
		name = input.nextLine();
		
			System.out.print("Enter first number => ");
			num1 = input.nextInt();
			
			System.out.print("Enter second number => ");
			num2 = input.nextInt();
			
			System.out.println("[1] Addition");
			System.out.println("[2] Difference");
			System.out.println("[3] Product");
			System.out.println("[4] Quotient");
			System.out.println("[5] Remainder");
			System.out.println("[6] ALL");
			
			System.out.print("Select an operation => ");
			operation = input.nextInt();
			
			if(operation == 1) {
				Sum(num1, num2, name);
			}else if(operation == 2) {
				Difference(num1, num2, name);
			}else if(operation == 3) {
				Product(num1, num2, name);
			}else if(operation == 4) {
				Quotient(num1, num2, name);
			}else if(operation == 5) {
				Remainder(num1, num2, name);
			}else if (operation == 6) {
				ALL(num1, num2, name);
			}else {
				System.out.println("Sorry! Invalid input!");
			}
	}
	
	public static void Sum(int x, int y, String z) {
		int result = x + y;
		System.out.println("Hello, " + z + "! The sum is " + result);
	}
	
	public static void Difference(int x, int y, String z) {
		int result = x - y;
		System.out.println("Hello, " + z + "! The difference is " + result);
	}
	
	public static void Product(int x, int y, String z) {
		int result = x * y;
		System.out.println("Hello, " + z + "! The product is " + result);
	}
	
	public static void Quotient(int x, int y, String z) {
		int result = x / y;
		System.out.println("Hello, " + z + "! The quotient is " + result);
	}
	
	public static void Remainder(int x, int y, String z) {
		int result = x % y;
		System.out.println("Hello, " + z + "! The remainder is " + result);
	}
	
	public static void ALL(int x, int y, String z) {
		Sum(x, y, z);
		Difference(x, y, z);
		Product(x, y, z);
		Quotient(x, y, z);
		Remainder(x, y, z);
	}

}
