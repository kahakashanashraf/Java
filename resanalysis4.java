package code;
import java.util.Scanner;
public class resanalysis4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
      int student = data.nextInt();
      int pass = 0;
      int fail = 0;
      for (int i = 1; i <= student; i++) {
          System.out.print("Enter the result for student " + i + " :");
          double score = data.nextDouble();
          
          if (score > 100) {
              System.out.println("Invalid score for student " + i + ". Scores should not exceed 100.");
          } else if (score > 60) {
              pass++;
          } else {
              fail++;
          }

	}
      System.out.println("Number of students who passed: " + pass);
      System.out.println("Number of students who failed: " + fail);

	}
}
