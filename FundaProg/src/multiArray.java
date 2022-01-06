
public class multiArray {
	
	public static void main(String[] args) {
		
	}
	
	static {
		System.out.println("Hello");
		
		int a[][] = {{0,1,2,3},
	             {4,5,6,7},
	             {8,9,10,11}};
	
		for(int i = 0; i < a.length; i++){
			for(int x = 0; x < a[i].length; x++){
           System.out.print(a[i][x] + " ");
       }
   
       System.out.println();
   }
	}
}



