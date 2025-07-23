import java.util.Scanner;

public class parking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the vehicle type (Car, Bike, Truck): ");
        String vehicle = sc.nextLine();

        System.out.print("Enter the number of parking hours: ");
        int hrs = sc.nextInt();

        System.out.print("Enter the start time in 24-hour format (0 - 23): ");
        int time = sc.nextInt();

        int ratePerHour = 0;

        if (vehicle.equals("car")) {
            ratePerHour = 50;
        } else if (vehicle.equals("bike")) {
            ratePerHour = 30;
        } else if (vehicle.equals("truck")) {
            ratePerHour = 100;
        } else {
            System.out.println("Invalid vehicle type.");
            sc.close();
            return;
        }

        double total = ratePerHour * hrs;

        
        if (hrs > 5) {
            total = total * 0.8; 
        }

       
        if (time >= 18 || time < 8) {
            total = total * 1.5; 
        }

        System.out.println("Your total parking fee is: ₹" + total);

        sc.close();
    }
}
