package code;
import java.util.Scanner;

public class add2darray13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner data = new Scanner(System.in);

		        System.out.println("Enter the number of rows: ");
		        int rows = data.nextInt();
		        System.out.println("Enter the number of columns: ");
		        int cols = data.nextInt();

		        // Create two 2D arrays with the same dimensions
		        int[][] matrix1 = new int[rows][cols];
		        int[][] matrix2 = new int[rows][cols];

		        // Input loop for the first matrix
		        System.out.println("Enter elements for the first matrix:");
		        for (int row = 0; row < rows; row++) {
		            for (int col = 0; col < cols; col++) {
		                System.out.println("Enter element at position [" + row + "][" + col + "]: ");
		                matrix1[row][col] = data.nextInt();
		            }
		        }

		        // Input loop for the second matrix
		        System.out.println("Enter elements for the second matrix:");
		        for (int row = 0; row < rows; row++) {
		            for (int col = 0; col < cols; col++) {
		                System.out.println("Enter element at position [" + row + "][" + col + "]: ");
		                matrix2[row][col] = data.nextInt();
		            }
		        }
		        
		        int[][] result = new int[rows][cols];

		        for (int row = 0; row < rows; row++) {
		            for (int col = 0; col < cols; col++) {
		                result[row][col] = matrix1[row][col] + matrix2[row][col];
		            }
		        }

		        System.out.println("Result of matrix addition:");
		        for (int row = 0; row < rows; row++) 
		        {
		            for (int col = 0; col < cols; col++) 
		            {
		                System.out.print(result[row][col] + " ");
		            }
		            System.out.println();
		        }


	}

}
