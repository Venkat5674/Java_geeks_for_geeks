import java.util.Scanner;


public class factorial {
    int factorial(int n){
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }
    public static void main(String args[])
    {
        factorial obj = new factorial();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is " + obj.factorial(num));
    }

}
