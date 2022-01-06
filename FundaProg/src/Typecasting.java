
import java.util.Scanner;

public class Typecasting {

	public static void main(String[] Jeyym) {
		
		Scanner input = new Scanner(System.in);
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		System.out.print("Enter a date in the format m,d,year => ");
		String user = input.nextLine();
		
		String date[] = user.split(",");
		
		int month = Integer.parseInt(date[0]);
		int day = Integer.parseInt(date[1]);
		
		if(date[2].length() == 2) {
			System.out.printf("%s %d, 20%s", months[month-1], day, date[2]);
		}else {
			System.out.printf("%s %d, %s", months[month-1], day, date[2]);
		}
		
	}
	
}


























