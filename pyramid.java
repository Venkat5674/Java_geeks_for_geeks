import java.util.Scanner;

public class pyramid {  // Changed class name to start with capital letter
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");  // Added prompt
        int n = sc.nextInt();

        int row = 1;
        while (row <= n) {
            int col = 1;

            // Print spaces
            while (col <= (n - row)) {
                System.out.print(" ");
                col++;
            }

            // Print stars
            int k = 1;
            while (k <= (2 * row - 1)) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            row++;
        }
    }
}