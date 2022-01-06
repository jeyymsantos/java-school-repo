import java.util.*;
public class gettingModulo
{
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int steal, used, gain;
		System.out.println("Energy = 3");
		
		System.out.print("Energy Used => ");
		used = input.nextInt();
		
		System.out.print("Energy Stolen => ");
		steal = input.nextInt();
		
		System.out.print("Energy Gain => ");
		gain = input.nextInt();
		
		System.out.println("Total Energy => ");
		
		int totalEnergy = 3 - used + 2 - steal + gain;
		System.out.print(totalEnergy);
		
	}
 }