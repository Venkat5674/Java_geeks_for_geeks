import java.util.Scanner;

public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hours = sc.nextInt();
        int totalFee = 0;
        
        if (hours <= 2) {
            totalFee = hours * 5;
        } else if (hours <= 5) {
            totalFee = (2 * 5) + (hours - 2) * 3;
        } else {
            totalFee = (2 * 5) + (3 * 3) + (hours - 5) * 2;
        }
        
        System.out.println(totalFee);
        
        sc.close();
    }
}
