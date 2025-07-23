import java.util.Scanner;

public class bank {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your balance:");
        double balance = sc.nextDouble();

        System.out.print("Enter the amount to withdraw:");
        double withdraw = sc.nextDouble();

        if(withdraw > balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance -= withdraw;
            System.out.println("Withdrawal successful. Your new balance is: " + balance);
        } 

        sc.close();
    }
}
