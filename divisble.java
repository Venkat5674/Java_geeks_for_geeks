import java.util.Scanner;
public class divisble {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 3 == 0 && number % 5 == 0){
            System.out.println("The Number is divisible by 3 and 5");
        }
        else{
            System.out.println("The Number is not divisible by 3 and 5");
        }
        sc.close();
    }
    
}
