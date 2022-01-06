import java.util.*;

public class Activity1 {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number;
		String word = "";
		
		String[] initial = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		String[] teen = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String [] tens = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		String [] general = {"hundred", "thousand", "million", "trillion"};
		
		int[] values = {100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10};
		
		//152, 658
		System.out.print("Enter a number = ");
		number = input.nextInt();
		
		int temporary, remainder, length;
		length = Integer.toString(number).length();
		
		temporary = number / 100;
		remainder = number % 100;
		
		if(temporary == 1) {
			word = initial[0];
		}else if(temporary == 2) {
			word = initial[1];
		}else if(temporary == 3) {
			word = initial[2];
		}else if(temporary == 4) {
			word = initial[3];
		}else if(temporary == 5) {
			word = initial[4];
		}else if(temporary == 6) {
			word = initial[5];
		}else if(temporary == 7) {
			word = initial[6];
		}else if(temporary == 8) {
			word = initial[7];
		}else if(temporary == 9) {
			word = initial[8];
		}else if(temporary == 10) {
			word = initial[9];
		}
		
		
		if(length >= 4) {
			word = word + "-" + general[1];
		}else if(length >= 1) {
			word = word + "-" + general[0];
		}
		
		temporary = remainder / 10;
		remainder = remainder % 10;
		
		if(temporary == 1) {
			if(remainder == 1) {
				word = word + " " + teen[0];
			}else if(remainder == 2) {
				word = word + " " + teen[1];
			}else if(remainder == 3) {
				word = word + " " + teen[2];
			}else if(remainder == 4) {
				word = word + " " + teen[3];
			}else if(remainder == 5) {
				word = word + " " + teen[4];
			}else if(remainder == 6) {
				word = word + " " + teen[5];
			}else if(remainder == 7) {
				word = word + " " + teen[6];
			}else if(remainder == 8) {
				word = word + " " + teen[7];
			}else if(remainder == 9) {
				word = word + " " + teen[8];
			}
		}
		else {
			if(temporary == 2) {
				word = word + " " + tens[0];
			}else if(temporary == 3) {
				word = word + " " +  tens[1];
			}else if(temporary == 4) {
				word = word + " " +  tens[2];
			}else if(temporary == 5) {
				word = word + " " +  tens[3];
			}else if(temporary == 6) {
				word = word + " " + tens[4];
			}else if(temporary == 7) {
				word = word + " " + tens[5];
			}else if(temporary == 8) {
				word = word + " " + tens[6];
			}else if(temporary == 9) {
				word = word + " " + tens[7];
			}else if(temporary == 10) {
				word = word + " " + tens[8];
			}
			
			if(remainder == 1) {
				word = word + "-" + initial[0];
			}else if(remainder == 2) {
				word = word + "-" + initial[1];
			}else if(remainder == 3) {
				word = word + "-" + initial[2];
			}else if(remainder == 4) {
				word = word + "-" + initial[3];
			}else if(remainder == 5) {
				word = word + "-" + initial[4];
			}else if(remainder == 6) {
				word = word + "-" + initial[5];
			}else if(remainder == 7) {
				word = word + "-" + initial[6];
			}else if(remainder == 8) {
				word = word + "-" + initial[7];
			}else if(remainder == 9) {
				word = word + "-" + initial[8];
			}else if(remainder == 10) {
				word = initial[9];
			}
		}
		
	
		System.out.print(word);
		
		
	}
}
