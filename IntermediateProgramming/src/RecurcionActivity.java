import java.util.Scanner;
public class RecurcionActivity {
	
	static int first = 0;
	static int second = 1;
	static int next = 0;
	static int sum = 0;
	static int y = 0;
	
	public static void main(String[] Jeyym) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number => ");
		int num = input.nextInt();
		System.out.println("Summation => " + usingRecursion(num));	
	}
	
	static int usingRecursion(int x) {
		if(x > 0) {
			y++;
			System.out.println("F" + y + " -> " + first);
			next = first + second;
			first = second;
			second = next;
			
			sum += (second-first);
			return usingRecursion(x-1);
		}else {
			return sum;
		}
	}
	
	
	
	
	static int usingLoop(int x) {
		int y = 0;
		int first  = 0;
		int second = 1;
		int next = 0;
		int sum = 0;
		
		for(int z = 0; z < x; z++) {
			y++;
			System.out.println("F" + y + " -> " + first);
			next = first + second;
			first = second;
			second = next;
			
			sum += (second-first);
		}
		
		return sum;
	}
}
