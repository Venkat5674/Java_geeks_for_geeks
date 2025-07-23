import java.util.Scanner;

public class NtermAP {
   
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the first term (a): ");
     int a  = sc.nextInt();

     System.out.print("Enter the common difference (d): ");
     int d = sc.nextInt();

    System.out.print("Enter the number of terms (n): ");
    int n = sc.nextInt();

    int Nterm = a + (n - 1) * d;
    System.out.println("The " + n + "th term of the AP is: " + Nterm);
    sc.close();
    
    }

}
