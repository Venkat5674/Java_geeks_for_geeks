import java.util.Scanner;

public class CurrencyNoteCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        int note2000 = 0, note500 = 0, note200 = 0, note100 = 0;
        int note50 = 0, note20 = 0, note10 = 0, note1 = 0;

        if (amount >= 2000) {
            note2000 = amount / 2000;
            amount %= 2000;
        }
        if (amount >= 500) {
            note500 = amount / 500;
            amount %= 500;
        }
        if (amount >= 200) {
            note200 = amount / 200;
            amount %= 200;
        }
        if (amount >= 100) {
            note100 = amount / 100;
            amount %= 100;
        }
        if (amount >= 50) {
            note50 = amount / 50;
            amount %= 50;
        }
        if (amount >= 20) {
            note20 = amount / 20;
            amount %= 20;
        }
        if (amount >= 10) {
            note10 = amount / 10;
            amount %= 10;
        }
        if (amount >= 1) {
            note1 = amount;
        }

        // Display note count
        System.out.println("\nCurrency Note Count:");
        if (note2000 > 0) System.out.println("₹2000: " + note2000);
        if (note500 > 0) System.out.println("₹500: " + note500);
        if (note200 > 0) System.out.println("₹200: " + note200);
        if (note100 > 0) System.out.println("₹100: " + note100);
        if (note50 > 0) System.out.println("₹50: " + note50);
        if (note20 > 0) System.out.println("₹20: " + note20);
        if (note10 > 0) System.out.println("₹10: " + note10);
        if (note1 > 0) System.out.println("₹1: " + note1);
    }
}
