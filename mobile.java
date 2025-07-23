import java.util.Scanner;

public class mobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Time:");
        int time = sc.nextInt();

        if (time <100)
        {
            System.out.println("You are using a Basic Plan");
        }
        else if (time >= 100 && time < 300){
            System.out.println("You are using a Standard Plan");
        }
        else if (time < 500){
            System.out.println("You are using a Premium Plan");
        }
        else {
            System.out.println("You are using a Unlimited Plan");
        }    
    }
}
