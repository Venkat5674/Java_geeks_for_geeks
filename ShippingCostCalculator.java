import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weight = sc.nextInt();  // package weight
        int distance = sc.nextInt(); // distance in km
        int cost = 0;

        // Calculate weight-based cost
        if (weight <= 5) {
            cost = weight * 10;
        } else {
            cost = (5 * 10) + ((weight - 5) * 8);
        }

        // Add distance-based flat fee
        if (distance > 100) {
            cost += 50;
        }

        System.out.println(cost);
        sc.close();
    }
}
