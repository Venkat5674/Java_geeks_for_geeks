import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the starting number
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        // Ask the user for the ending number
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        int sum = 0;
        int i = start;

        // Loop through the range
        while (i <= end) {
            // Check if the number is odd
            if (i % 2 != 0) {
                sum = sum + i; // Add it to the sum
            }

            i = i + 1; // Move to the next number
        }

        // Print the result
        System.out.println("The sum of odd numbers from " + start + " to " + end + " is: " + sum);

        scanner.close();
    }
}
