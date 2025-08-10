import java.util.Scanner;

public class TaxDeduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int income = sc.nextInt();
        int dependents = sc.nextInt();
        int deduction = 0;
        
        if (income < 50000) {
            deduction = 500 * dependents;
        } else {
            if (dependents >= 2) {
                deduction = 300 * dependents;
            } else {
                deduction = 0;
            }
        }
        
        System.out.println(deduction);
        
        sc.close();
    }
}
