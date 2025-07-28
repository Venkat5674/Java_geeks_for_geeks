import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int low = 1;
        int high = 100;
        int guess;
        String response;

        System.out.println("Think of a number between " + low + " and " + high + ".");
        System.out.println("I will try to guess it!");
        System.out.println("Respond with:");
        System.out.println("'h' if my guess is too high");
        System.out.println("'l' if my guess is too low");
        System.out.println("'c' if my guess is correct");

        while (low <= high) {
            guess = (low + high) / 2;
            System.out.print("Is your number " + guess + "? (h/l/c): ");
            response = scanner.nextLine().toLowerCase();

            if (response.equals("h")) {
                high = guess - 1;
            } else if (response.equals("l")) {
                low = guess + 1;
            } else if (response.equals("c")) {
                System.out.println("Yay! I guessed your number correctly.");
                break;
            } else {
                System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
            }
        }

        scanner.close();
    }
}
