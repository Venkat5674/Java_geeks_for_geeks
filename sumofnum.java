import java.util.Scanner;

public class sumofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        
        int num = sc.nextInt();

        int sum = num * (num + 1) / 2;

        System.out.println("Sum of first " + num + " Natural Numbers is : " + sum); 
    }
}
