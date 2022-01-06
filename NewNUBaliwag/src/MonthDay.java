
import java.util.Scanner;

public class MonthDay {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Declaration of Variables
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};	
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		//User Input for Month
		System.out.print("Enter month => ");
		int monthIndex = input.nextInt();
		
		//Check if Month is Out of Bounds
		if(monthIndex > 12 || monthIndex < 1) {
			System.out.println("Month is out of bounds!");
		}
		else {
			//User Input for Day
			System.out.print("Enter day   => ");
			int dayIndex = input.nextInt();
			
			//Check if Day is Out of Bounds
			if(dayIndex > 7 || dayIndex < 1) {
				System.out.println("Day is out of bounds!");
			}else {
				//Display Required Output
				System.out.printf("%d is %s\n", monthIndex, months[monthIndex-1]);
				System.out.printf("%d is %s\n", dayIndex, days[dayIndex-1]);
			}
		}		
	}

}
