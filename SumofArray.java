import java.util.Scanner;

public class SumOfArrayUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declare the array
        int[] numbers = new int[n];

        // Input elements from user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Output the sum
        System.out.println("Sum of array elements: " + sum);

        // Close the scanner
        scanner.close();
    }
}
