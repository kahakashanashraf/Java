package code;

import java.util.Scanner;

public class arraysearch9 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        // Define an array of numbers
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Enter the element to search for: ");
        int target = data.nextInt();

        int Index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
               Index = i;
                break;
            }
        }

        if (Index != -1) {
            System.out.println(target + " was found in the array at index " + Index);
        } else {
            System.out.println(target + " was not found in the array.");
        }

    }
}

