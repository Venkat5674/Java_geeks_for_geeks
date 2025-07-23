import java.util.Scanner;

public class GPterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first term (a):");
        int a = sc.nextInt();

        System.out.println("Enter the common ratio (r):");
        int r = sc.nextInt();

        System.out.println("Enter the term number (n):");
        int n = sc.nextInt();

        double nthTerm = a * Math.pow(r, n - 1);

        System.out.println("The " + n + "th term of the G.P. is: " + nthTerm);

        sc.close();
    }
}
