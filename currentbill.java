import java.util.Scanner;

public class currentbill {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No.of Units Consumed: ");

        int unit = sc.nextInt();

        double bill = 0;

        if (unit < 0 && unit > 100){
            bill = unit*1.5;
            System.out.println("Your Bill Amount is :" + bill);
        }
        else if (unit >=100 && unit < 200){
            bill = unit*2.0;
            System.out.println("Your Bill Amount is :" + bill);
        }
        else if (unit >= 200 && unit < 300){
            bill = unit*3.0;
            System.out.println("Your Bill Amount is :" + bill);
        }
        else if (unit >= 300){
            bill = unit*5.0;
            System.out.println("Your Bill Amount is :" + bill);
        }
        else {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
    
}
