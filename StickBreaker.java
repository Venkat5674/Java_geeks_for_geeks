import java.util.Scanner;

public class StickBreaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: initial stick length
        System.out.print("Enter the initial length of the stick (in cm): ");
        double length = scanner.nextDouble();

        int days = 0;

        // Keep breaking the stick until its length is less than 1 cm
        while (length >= 1) {
            length = length / 2;
            days++;
        }

        // Output the result
        System.out.println("It takes " + days + " days for the stick to become less than 1 cm.");
    }
}
