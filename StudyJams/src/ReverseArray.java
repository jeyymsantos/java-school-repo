
public class ReverseArray {

	public static void main(String[] args) {
		
		int[] numbers = {54, 32, 21, 1, 23, 465, 6, 34, 21};
		
		for(int x = 0; x < numbers.length; x++) {
			System.out.print(numbers[x] + " ");
		}
		
		System.out.println();
		
		for(int x = numbers.length-1; x >= 0; x--) {
			System.out.print(numbers[x] + " ");
		}

	}

}
