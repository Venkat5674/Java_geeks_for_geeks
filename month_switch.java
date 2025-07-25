import java.util.Scanner;

public class MonthDaysSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1 to 12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("This month has 31 days");
                break;

            case 4: case 6: case 9: case 11:
                System.out.println("This month has 30 days");
                break;

            case 2:
                // Leap year logic
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("February has 29 days (Leap Year)");
                } else {
                    System.out.println("February has 28 days");
                }
                break;

            default:
                System.out.println("Invalid month number!");
        }
    }
}
