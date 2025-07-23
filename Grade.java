import java.util.Scanner;

public class Grade {
   
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Marks in S1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter your Marks in S2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter your Marks in S3: ");
        int s3 = sc.nextInt();
        System.out.print("Enter your Marks in S4: ");
        int s4 = sc.nextInt();
        System.out.print("Enter your Marks in S5: ");
        int s5 = sc.nextInt();

        double avg = (s1 + s2 + s3 + s4 + s5) / 5.0;
        System.out.println("Your Average Marks is: " + avg);

        if (avg >= 90){
            System.out.println("Your Grade is A+");
        }
        else if (avg >= 80){
            System.out.println("Your Grade is A");
        }
        else if (avg >= 70){
            System.out.println("Your Grade is B");
        }
        else if (avg >= 60){
            System.out.println("Your Grade is C");
        }
        else if (avg >= 50){
            System.out.println("Your Grade is D");
        }
        else {
            System.out.println("You have Failed");
        }
        sc.close();
    }

}
