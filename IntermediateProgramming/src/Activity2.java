import java.util.Scanner;
public class Activity2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String usernames[] = {"one", "two", "three", "four", "five", "six"};
		int passwords[] = {1,2,3,4,5,6};
		
		System.out.print("Enter username => ");
		String tempUsername = input.nextLine();
		
		System.out.print("Enter password => ");
		int tempPassword = input.nextInt();
		
		int cases = 0;
		// Case 1: both matches = "Welcome to our system!"
		// Case 2: Correct one credential but the other one is not = "Username & Password Mismatch!"
		// Case 3: Both wrong = "Username and Password not found."
		
		for(int i = 0; i < usernames.length; i++) {
			if(usernames[i].equals(tempUsername) && passwords[i] == tempPassword) {
				cases = 1;
				break;
			}else if(usernames[i].equals(tempUsername) || passwords[i] == tempPassword) {
				cases = 2;
				break;
			}
		}
		
		if(cases == 1) {
			System.out.println("Welcome to our system!");
		}else if(cases == 2) {
			System.out.println("Username and Password mismatch!");
		}else {
			System.out.println("Username and Password not found!");
		}
	}
}
