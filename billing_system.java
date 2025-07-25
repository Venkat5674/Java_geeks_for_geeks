import java.util.Scanner;

public class BillingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Product 1 details
        System.out.println("Enter details for Product 1:");
        System.out.print("Product Name: ");
        String product1 = sc.nextLine();
        System.out.print("Quantity: ");
        int qty1 = sc.nextInt();
        System.out.print("Price per unit: ");
        double price1 = sc.nextDouble();

        sc.nextLine(); // consume newline

        // Product 2 details
        System.out.println("\nEnter details for Product 2:");
        System.out.print("Product Name: ");
        String product2 = sc.nextLine();
        System.out.print("Quantity: ");
        int qty2 = sc.nextInt();
        System.out.print("Price per unit: ");
        double price2 = sc.nextDouble();

        // Calculate total
        double total1 = qty1 * price1;
        double total2 = qty2 * price2;
        double totalAmount = total1 + total2;

        double discount = 0;
        if (totalAmount > 5000) {
            discount = totalAmount * 0.20; // 20% discount
        }

        double finalAmount = totalAmount - discount;

        // Print Bill
        System.out.println("\n----- Bill Summary -----");
        System.out.printf("%s - Qty: %d, Unit Price: %.2f, Total: %.2f\n", product1, qty1, price1, total1);
        System.out.printf("%s - Qty: %d, Unit Price: %.2f, Total: %.2f\n", product2, qty2, price2, total2);
        System.out.printf("Total Amount: ₹%.2f\n", totalAmount);
        System.out.printf("Discount: ₹%.2f\n", discount);
        System.out.printf("Final Amount to Pay: ₹%.2f\n", finalAmount);
    }
}
