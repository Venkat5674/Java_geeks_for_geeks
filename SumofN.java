import java.util.Scanner;

public class SumOfRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the starting and ending number
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        int sum = 0;

        // Calculate sum in the given range
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("The sum of numbers from " + start + " to " + end + " is: " + sum);

        scanner.close();
    }
}
