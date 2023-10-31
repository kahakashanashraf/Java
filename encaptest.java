package code;
import java.util.Scanner;

public class encaptest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the course name: ");
        String name = scanner.nextLine();

        // Create an instance of the Course class
        Course course = new Course(name);

        // Display the course name using the getter method
        System.out.println("Course Name: " + course.getCourseName());

        // Update the course name using the setter method
        System.out.print("Enter a new course name: ");
        String newName = scanner.nextLine();
        course.setCourseName(newName);

        // Display the updated course name using the getter method
        System.out.println("Updated Course Name: " + course.getCourseName());

        
	}

}
