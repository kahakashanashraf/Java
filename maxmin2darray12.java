package code;
import java.util.Scanner;

public class maxmin2darray12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner data = new Scanner(System.in);

		        System.out.print("Enter the number of rows: ");
		        int numRows = data.nextInt();

		        System.out.print("Enter the number of columns: ");
		        int numCols = data.nextInt();

		        int[][] matrix = new int[numRows][numCols];

		        for (int row = 0; row < numRows; row++) {
		            for (int col = 0; col < numCols; col++) {
		                System.out.print("Enter the value for matrix[" + row + "][" + col + "]: ");
		                matrix[row][col] = data.nextInt();
		            }
		        }

		        int max = matrix[0][0];
		        int min = matrix[0][0];

		        for (int row = 0; row < numRows; row++) {
		            for (int col = 0; col < numCols; col++) {
		                int value = matrix[row][col];
		                if (value > max) {
		                    max = value;
		                }
		                if (value < min) {
		                    min = value;
		                }
		            }
		        }

		        System.out.println("Maximum value in the 2D array: " + max);
		        System.out.println("Minimum value in the 2D array: " + min);

		   
		    }
		}

