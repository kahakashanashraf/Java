package code;
import java.util.Scanner;

public class maxminarray8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int elements = data.nextInt();
 int [] array = new int [elements];

 for( int i=0;i< elements;i++)
 {
	 System.out.print("Enter element " + (i + 1) + ": ");
     array[i] = data.nextInt();
			 }

 if (elements == 1) {
     System.out.println("The array has only one element: " + array[0]);
     return;
 }
 int max = array[0]; 
 int min = array[0]; 
 for (int i = 1; i < elements; i++) {
     if (array[i] > max) {
         max = array[i];
     }
     if (array[i] < min) {
         min = array[i];
     }
 }
 System.out.println("Maximum value in the array: " + max);
 System.out.println("Minimum value in the array: " + min);

 }

}