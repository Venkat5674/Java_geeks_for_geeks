import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int principal = sc.nextInt();
        double rate = sc.nextDouble();
        int time = sc.nextInt();
        int compounds = sc.nextInt();
        
        double amount = principal * Math.pow(1 + (rate / (100 * compounds)), compounds * time);
        
        // Round to 2 decimal places
        amount = Math.round(amount * 100.0) / 100.0;
        
        System.out.println(amount);
        
        sc.close();
    }
}
