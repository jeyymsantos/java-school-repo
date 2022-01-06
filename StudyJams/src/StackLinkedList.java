import java.util.*;
public class StackLinkedList {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0;
		char looper = '1';

		try {
			System.out.print("Enter an Integer: ");
			num = scan.nextInt();

			if (num > 99 || num < 0) {
				System.out.println("Invalid Entry!");
			} else {

				if (num == 0) {
					System.out.print("Number in words: Zero");
				} else {
					System.out.print("Number in words: " + NumToWord(num));
				}

				scan.close();
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid number");
		}
	}

	private static String NumToWord(int number) {

		String wordConvert = "";
		String onesArr[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
		String tensArr[] = { "Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

		if (number == 0) {
			return "zero";
		}



		if (number > 0) {
			if (number < 20) {
				wordConvert += onesArr[number];
			} else {
				wordConvert += tensArr[number / 10];
				if ((number % 10) > 0) {
					wordConvert += "-" + onesArr[number % 10];
				}
			}
		}
		return wordConvert;
	}
}