import java.util.*;

public class Day1 {

	static Scanner input = new Scanner(System.in); 
	
	public static void main(String[] args) {

		String[] names = {"Marites", "Marigona", "Mariflor", "Maribeth", "Marlou", "Maring", "Mara"};
		
		System.out.print("Enter a name to search => ");
		String tempName = input.nextLine();
		
		int ID = -1;
		
		for(int x = 0; x < names.length; x++) {
			if(names[x].equals(tempName)) {
				ID = x;
				break;
			}
		}
		
		if(ID != -1) {
			System.out.println(tempName + " is found at index " + ID + ".");
		}else {
			System.out.println(tempName + " is not found!");
		}
		
	}

}
