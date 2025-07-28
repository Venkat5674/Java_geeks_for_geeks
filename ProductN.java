import java.util.Scanner;

public class ProductOfRangeWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter the starting number
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        // Asking the user to enter the ending number
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        // Variable to store the final product (we use long in case the number gets big)
        long product = 1;

        // Starting from the first number in the range
        int i = start;

        // Repeat this block until i is greater than end
        while (i <= end) {
            // Multiply current number with product
            product = product * i;

            // Move to the next number
            i = i + 1;
        }

        // Print the final product
        System.out.println("The product of numbers from " + start + " to " + end + " is: " + product);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
