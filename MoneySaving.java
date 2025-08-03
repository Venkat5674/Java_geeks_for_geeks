import java.util.Scanner;

public class MoneySaving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter daily saving amount (₹): ");
        int dailySave = sc.nextInt();

        System.out.print("Enter target amount (₹): ");
        int targetAmount = sc.nextInt();

        int total = 0;
        int days = 0;

        while (total < targetAmount) {
            total += dailySave;
            days++;
        }

        System.out.println("It will take " + days + " day(s) to save at least ₹" + targetAmount);
        sc.close();
    }
}
