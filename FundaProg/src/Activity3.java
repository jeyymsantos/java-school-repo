import java.util.Scanner;

public class Activity3{
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int Code = 0;
			int Qty = 0;
				double  Price = 0;
					double Cash = 0;
						int ans = 1;
	do{
		System.out.println("Code    Description    Price");
		System.out.println(" 1         Pencil      20.00");				
		System.out.println(" 2        Notebook     40.00");
		System.out.println(" 3         Eraser      10.00");
		System.out.print("Item Code: " );
				Code = read.nextInt();
					if (Code==1){System.out.println("Description:Pencil = 20.00");
					Price=20.00;
					}else if (Code==2){System.out.println("Description:Notebook = 40.00");
					Price=40.00;
					}else if (Code==3){System.out.println("Description:Eraser = 10.00");
					Price=10.00;}
			System.out.print("Qty: " );
			Qty = read.nextInt();
			double  Total = Price*Qty;
			System.out.println("Total Amount:" + Total );
			System.out.print("Cash Rendered: " );
			Cash = read.nextInt();
			double Change = Cash-Total;
				if(Cash<Total){System.out.println("Insufficient Funds");
				}
			System.out.println("Change: " + Change);
			System.out.println("Buy another Item? 1=Yes ; 2=No");
			ans = read.nextInt();
		     
			} while(ans==1);
					
	}
}