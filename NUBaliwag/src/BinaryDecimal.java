/**
 * @(#)BinaryDecimal.java
 *
 *
 * @author 
 * @version 1.00 2019/7/17
 */

import java.util.Scanner;
public class BinaryDecimal {
	
static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
    	int binary[] = new int[8];
    	int[] value = {128, 64, 32, 16, 8, 4, 2, 1};
    	int user, ctr;
    	
    	
    	System.out.println("CONVERTING DECIMAL TO BINARY");
    	System.out.println("============================\n");
    	System.out.print("Enter a decimal number => ");
    	user = input.nextInt();
    	
    	if(user < 256)
    	{
    		for(ctr = 0; ctr < binary.length; ctr++)
    		{
    			if(user >= value[ctr])
    			{
    			user -= value[ctr];
    			binary[ctr] = 1;
    			}
    			else
    			{
    			binary[ctr] = 0;	
    			}
    		}
    		for(ctr = 0; ctr < binary.length; ctr++)
    		{	
    		System.out.print(binary[ctr]);
    		}
    	}
    	else
    	{
    		System.out.println("Invalid Input!");
    	}
    	System.out.println("\nDeveloped by : JeyymSantos");
    }  
}