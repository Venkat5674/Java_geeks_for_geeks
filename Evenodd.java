import java.util.Scanner;

public class Evenodd {

    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter an Number: ");

        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("The number " + num + " is Even.");

        }
        else {
            System.out.println("The Number " + num + " is Odd.");
        }
        sc.close();
    }
}