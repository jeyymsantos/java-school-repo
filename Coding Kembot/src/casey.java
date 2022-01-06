import java.util.Scanner;

public class casey {
	
	private static Scanner scan;
	
	public static void main(String args[])	{
		scan = new Scanner(System.in);
        int numbers[]={0,1,1,2,3,5,8};
        System.out.print("Enter a number: ");
        int result = scan.nextInt();
        System.out.println(sum(numbers, result));
        }
	public static int sum(int numbers[], int n) {
		if(n==0) {
			System.out.println(n);
			return 0;
		}else {
			System.out.println(n);
			return n + sum(numbers, n-1);
		}
    }
}