package code;
import java.util.Scanner;
public class rating10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);

        System.out.print("Enter the number of cafeteria ratings: ");
        int numRatings = data.nextInt();

        if (numRatings <= 0) {
            System.out.println("No ratings to analyze.");
            return;
        }

        int[] ratings = new int[numRatings];

        for (int i = 0; i < numRatings; i++)
        {
            System.out.print("Enter rating " + (i + 1) + " (1-5): ");
            int rating = data.nextInt();

            if (rating < 1 || rating > 5) 
            {
                System.out.println("Invalid rating. Ratings must be between 1 and 5.");
                i--; 
                // Decrement the counter to rate again
            } 
            else 
            {
                ratings[i] = rating;
            }
        }

     
        double total= 0;
        for (int i = 0; i < ratings.length; i++) {
            int rating = ratings[i];
            total += rating;
        }        double averageRating = total / numRatings;

        System.out.println("Average cafeteria rating: " + averageRating);

    }
}

