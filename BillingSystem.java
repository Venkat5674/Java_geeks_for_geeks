import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = sc.nextInt();
        double finalAmount;
        
        if (total > 100) {
            finalAmount = total * 0.90; // 10% discount
        } else {
            finalAmount = total * 0.95; // 5% discount
        }
        
        // Print with exactly 2 decimal places
        System.out.printf("%.2f", finalAmount);
        
        sc.close();
    }
}
