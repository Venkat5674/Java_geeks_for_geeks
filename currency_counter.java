import java.util.Scanner;

public class CurrencyBreakdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        int note;

        if (amount >= 1000) {
            note = amount / 1000;
            amount = amount % 1000;
            System.out.println("1000's: " + note);
        }

        if (amount >= 500) {
            note = amount / 500;
            amount = amount % 500;
            System.out.println("500's: " + note);
        }

        if (amount >= 200) {
            note = amount / 200;
            amount = amount % 200;
            System.out.println("200's: " + note);
        }

        if (amount >= 100) {
            note = amount / 100;
            amount = amount % 100;
            System.out.println("100's: " + note);
        }

        if (amount >= 20) {
            note = amount / 20;
            amount = amount % 20;
            System.out.println("20's: " + note);
        }

        if (amount >= 10) {
            note = amount / 10;
            amount = amount % 10;
            System.out.println("10's: " + note);
        }

        if (amount >= 1) {
            note = amount;
            System.out.println("1's: " + note);
        }
    }
}
