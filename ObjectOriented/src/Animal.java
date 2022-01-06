import java.util.Scanner;

public class Animal {

 public static void main(String[] args) { 

        double daysworked,rateperday,grossimpay;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Days Worked: ");
        daysworked=sc.nextDouble();
        System.out.println("Enter your rate per Day: ");
        rateperday=sc.nextDouble();

        grossimpay=daysworked*rateperday;
        System.out.println("Your Gross Pay: " + grossimpay);

    }

}