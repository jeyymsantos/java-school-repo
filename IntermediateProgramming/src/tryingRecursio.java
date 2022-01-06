
public class tryingRecursio {

	public static void main(String[] args) {
		int x = 5;
		printNumDesc(x);
		System.out.println("- - - - - - - ");
		printNumAsc(x);
	}
	
	public static void printNumDesc(int num) {
		if (num > 0) {
			System.out.println(num);
			printNumDesc(num-1);
		}
	}
	
	public static void printNumAsc(int num) {
		if (num > 0) {
			printNumAsc(num-1);
			System.out.println(num);
		}
	}
}
