package code;
import java.util.Scanner;
//imports the Scanner class from the java.util package,used for user input.

public class max6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner (System.in);
		// Create a Scanner object
		System.out.print("Enter the first number: ");
		 int num1 = number.nextInt();
		 System.out.print("Enter the second number: ");
		 int num2 = number.nextInt();
		 System.out.print("Enter the third number: ");
		 int num3 = number.nextInt();
		 int maxnum  = Math.max(num3, Math.max(num1, num2));

		 System.out.println("Greatest Number = " + maxnum );
		    
	}

}
