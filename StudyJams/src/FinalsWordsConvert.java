import java.util.*;

public class FinalsWordsConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer => ");
		int number = input.nextInt();

		if(number < 0 || number >= 100) {
			System.out.println("Invalid input!");
		}else {
			DisplayName(number);
		}
	}

	public static void DisplayName(int number) {
		String ones[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		String tens[] = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String ty[] = {"Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

		if(number < 10) {
			System.out.println("Output: " + ones[number]);
		}else if(number < 20) {
			System.out.println("Output: " + tens[number-10]);
		}else {
			int first = number % 10;
			int second = number / 10;

			if(first == 0) {
				System.out.println("Output: " + ty[second]);
			}else {
				System.out.println("Output: " + ty[second] + "-" + ones[first]);
			}
		}

	}

}
