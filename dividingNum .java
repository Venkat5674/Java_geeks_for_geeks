import java.util.Scanner;

public class SplitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();  // Read input as a string

        System.out.println("The digits are:");
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            System.out.println(digit);
        }

        scanner.close();
    }
}
