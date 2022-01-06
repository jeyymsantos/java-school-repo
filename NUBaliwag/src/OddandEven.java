import java.util.Scanner;

public class OddandEven {
	
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] Jeyym) {
		
		int user = 0;
		
		System.out.print("Enter a number => ");
		user = reader.nextInt();
		
		if(user % 2 == 0) {
			System.out.println(user + " is an Even Number.");
		}
		else {
			System.out.println(user + " is an Odd Number.");
		}
	}
}























