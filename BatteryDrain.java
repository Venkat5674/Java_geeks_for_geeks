import java.util.Scanner;

public class BatteryDrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter drain rate (% per minute) : ");
        double  drainrate = sc.nextDouble();

        double battery = 100;
        int minutes = 0;

        while(battery > 0){
            battery = battery - drainrate;
            minutes = minutes + 1;
        }

        System.out.println("Robo will run for " + minutes + " minutes before battery drains out.");

        sc.close();
    }
}
