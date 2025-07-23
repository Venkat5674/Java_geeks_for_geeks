import java.util.Scanner;

public class Leap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Year:");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Yes");
        }
        else if (year % 400 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
