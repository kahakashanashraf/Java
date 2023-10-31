package code;
import java.util.Scanner;

public class avg2darray14 {

	    public static void main(String[] args) {
	        Scanner data = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = data.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int columns = data.nextInt();

	        int[][] matrix = new int[rows][columns];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
	                matrix[i][j] = data.nextInt();
	            }
	        }
	        
	        int sum = 0;
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                sum += matrix[i][j];
	            }
	        }
	        
	        double avg = (double) sum / (rows * columns);

	        System.out.println("The average of the elements in the 2D array is: " + avg);

	    }
	}

