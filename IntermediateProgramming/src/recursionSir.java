
public class recursionSir {

	public static void main(String[] args) {
		int x = 5;
		printNumDesc(x);
		System.out.println("- - - - - - - ");
		printNumAsc(x);
	}
	
	
	public static void printNumDesc(int num) {
		if (num == 0) {
			return;
		}else {
			System.out.println(num);
			printNumDesc(num-1);
		}
	}
	
	public static void printNumAsc(int num) {
		if (num == 0) {
			return;
		}else {
			printNumAsc(num-1);
			System.out.println(num);
		}
	}
	
}