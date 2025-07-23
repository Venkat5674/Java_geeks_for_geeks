import java.util.Scanner;

public class oddoreven {
    public static void main(String [] args){
        Scanner v = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = v.nextInt();

        if(num % 2 == 0){
            System.out.println("The Number " + num + " is Even");

        }
        else{
            System.out.println("The Number " + num + " is Odd");
        }
    }
}
