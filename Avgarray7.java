package code;
import java.util.Scanner;

public class Avgarray7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int elements = data.nextInt();
 int [] array = new int [elements];
 int sum = 0;
 for( int i=0;i< elements;i++)
 {
	 System.out.print("Enter element " + (i + 1) + ": ");
     array[i] = data.nextInt();
			 }
 for (int i=0;i< array.length;i++) 
 {
     sum += array[i];
 }
 double avg = (double) sum / array.length;
 System.out.println("Average of array elements: " + avg);
    
 }

}
