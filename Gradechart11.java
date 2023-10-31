package code;
import java.util.Scanner;

public class Gradechart11 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = data.nextInt();

        int[] scores = new int[students];
        char[] grades = new char[students];

        for (int i = 0; i < students; i++) {
            System.out.print("Enter the score for student " + (i + 1) + ": ");
            scores[i] = data.nextInt();

            // Convert scores to letter grades
            if (scores[i] >= 90) {
                grades[i] = 'A';
            } else if (scores[i] >= 80) {
                grades[i] = 'B';
            } else if (scores[i] >= 70) {
                grades[i] = 'C';
            } else if (scores[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        System.out.println("Grade Chart:");
        System.out.println("----------------------------------------------------");
        System.out.println("Student No.  |  Score  |  Grade");
        System.out.println("----------------------------------------------------");
        
        for (int i = 0; i < students; i++) {
            System.out.printf("    %-8d |   %-6d |   %-3c%n", (i + 1), scores[i], grades[i]);
        }
        System.out.println("----------------------------------------------------");
    /*%-8d is a formatted specifier that indicates a left-justified integer (d) field with a width of 8 characters.
% denotes the start of the format specifier.
- indicates left alignment.
8 is the total width reserved for the student number.
d indicates that the argument is a decimal (integer) value.
| separates the columns in the table.
%6d is a formatted specifier for a six-character width integer field for the student's score.
%3c is a formatted specifier for a three-character width character field for the student's grade.
%n is the platform-independent newline character.*/
    }
}
