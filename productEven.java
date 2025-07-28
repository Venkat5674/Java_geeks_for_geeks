import java.util.Scanner;

public class ProductOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the starting number
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        // Input the ending number
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        long product = 1; // Use long for large values
        int i = start; // Initialize the loop variable

        while (i <= end) {
            if (i % 2 == 0) { // Check if the number is even
                product *= i;
            }
            i++; // Move to the next number
        }

        System.out.println("Product of even numbers from " + start + " to " + end + " is: " + product);
    }
}
