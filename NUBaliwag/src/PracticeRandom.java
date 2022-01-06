import java.util.*;

public class PracticeRandom {

	public static void main(String[] args) {
	
		Random rn = new Random();
		
		for(int x = 0; x < 10; x++) {
			
			int y = rn.nextInt(9)+1 ;
			System.out.println(y);
			
		}
		
	}
}
