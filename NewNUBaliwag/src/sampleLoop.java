import java.util.*;

public class sampleLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int x = 0;

		System.out.println("This is While Loop");
		while(x < 10) {	
			System.out.println(x);
			x++;	
		}
		System.out.println("This is end of while Loop");             
		
		x = 0;
		
		System.out.println("This is Do-While Loop");
		do {
			System.out.println(x);
			x++;
		} while(x < 10);
		System.out.print("End of D-While loop");
	}
	
}
