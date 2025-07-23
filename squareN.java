import java.util.Scanner;

public class squareN {
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int t = sc.nextInt();
    int square;

    for(int i=0; i<=t; i++){
        square = t * t;
        System.out.println("The square of " + t + " is: " + square);
        t++;
        if(t>10){
            break;
        }
    }

   } 
}
