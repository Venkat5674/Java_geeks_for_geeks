import java.util.Scanner;

public class EvenOddPN {
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter an Number: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("The Number is Positive.");
            if(num % 2 == 0)
                System.out.println("The number " + num + " is Positive and Even.");
            else
                System.out.println("The number " + num + " is Positive and Odd.");
        }
        else if(num < 0){
            System.out.println("The Number is Negative.");
            if(num % 2 == 0)
                System.out.println("The number " + num + " is Negative and Even.");
            else
                System.out.println("The number " + num + " is Negative and Odd.");
        }
        else {
            System.out.println("The Number is Zero, which is neither Positive nor Negative.");
        }
    }
}
