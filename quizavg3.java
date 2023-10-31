package code;
import java.util.Scanner;

public class quizavg3 {
	
public static void main(String[] args) {
	Scanner data = new Scanner (System.in);
	System.out.print("Enter the number of students: ");
	 int stu = data.nextInt();
	 double total= 0;
	 for(int i=1;i<= stu;i++) 
	 {
		 System.out.print("Enter the Score of students: " + i + ":");
		 double score  = data.nextDouble();
		 total+=score;
		 
	 }
	 
	 double avg= total/stu;
	 System.out.print("The avg quiz score is : "  +avg);

	 



}
}
