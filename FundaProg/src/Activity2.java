import java.util.*;

public class Activity2 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number = InputNumber();
		boolean valid = CheckNumber(number);
		
		if(valid == true) {
			String word = GetWord(number);
			System.out.println("[" + number + "] is " + word);
		}else {
			System.out.println("Sorry, number out of bounds!");
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static int InputNumber() {
		
		System.out.print("Enter a number [0-9] => ");
		int number = input.nextInt();
		return number;
		
	}
	
	public static boolean CheckNumber(int number) {
		if(number >= 0 && number <= 9) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String GetWord(int number) {
		
		String word = "";
		
		if(number == 0) {
			word = "ZERO";
		}else if(number == 1) {
			word = "ONE";
		}else if(number == 2) {
			word = "TWO";
		}else if(number == 3) {
			word = "THREE";
		}else if(number == 4) {
			word = "FOUR";
		}else if(number == 5) {
			word = "FIVE";
		}else if(number == 6) {
			word = "SIX";
		}else if(number == 7) {
			word = "SEVEN";
		}else if(number == 8) {
			word = "EIGHT";
		}else if(number == 9) {
			word = "NINE";
		}
		
		return word;
	}

}
