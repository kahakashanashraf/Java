package code;
import java.util.Scanner;

public class switch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
        int stu = 0;
        int sum = 0;
        int countA = 0, countB = 0, countC = 0, countD = 0,countF = 0;
        
        System.out.print("Enter the number of students: ");
       stu = data.nextInt();
       
       for (int i = 1; i <= stu; i++) {
    	      System.out.print("Enter the score for student " + i + ": ");
              int score = data.nextInt();
              char grade;
              
              switch (score / 10)
              {
              case 10:
              case 9:
                  grade = 'A';
                  countA++;
                  break;
              case 8:
                  grade = 'B';
                  countB++;
                  break;
              case 7:
                  grade = 'C';
                  countC++;
                  break;
              case 6:
                  grade = 'D';
                  countD++;
                  break;

              default:
                  grade = 'F';
                  countF++;
                  break;
              }
              sum += score;

              System.out.println("Student " + i + " received grade: " + grade);
         

}
       double average = (double) sum / stu;

       System.out.println("Average score: " + average);
       System.out.println("Count of A grades: " + countA);
       System.out.println("Count of B grades: " + countB);
       System.out.println("Count of C grades: " + countC);
       System.out.println("Count of D grades: " + countD);
       System.out.println("Count of F grades: " + countF);

}
}
