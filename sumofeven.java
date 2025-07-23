import java.util.Scanner;
public class sumofeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No: ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=0; i<n; i++){
            sum = sum + (2*i);
        }
        System.out.print("Sum of First " + n + " Even Numbers is: ");
        System.out.println(sum);
    }
}
