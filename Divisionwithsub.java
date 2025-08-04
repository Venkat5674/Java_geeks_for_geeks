import java.util.Scanner;

public class DivisionUsingSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: dividend and divisor
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check for invalid input
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }

        int count = 0;

        // Subtract divisor from dividend until dividend < divisor
        while (dividend >= divisor) {
            dividend -= divisor;
            count++;
        }

        // Output the result
        System.out.println("Quotient: " + count);
        System.out.println("Remainder: " + dividend);
    }
}
