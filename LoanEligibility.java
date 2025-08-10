import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int income = sc.nextInt();
        int debt = sc.nextInt();
        
        boolean eligible = (income >= 50000 && debt < income * 0.2) ||
                           (income >= 30000 && debt == 0);
        
        System.out.println(eligible);
        
        sc.close();
    }
}
