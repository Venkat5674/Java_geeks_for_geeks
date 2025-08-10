import java.util.Scanner;

public class ValidScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        boolean divBy4 = (score % 4 == 0);
        boolean divBy6 = (score % 6 == 0);

        boolean isValid = divBy4 ^ divBy6; // XOR logic
        System.out.println(isValid);

        sc.close();
    }
}
