import java.util.Scanner;

public class taxcalc {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Income: ");
        double income = scan.nextDouble();
        double tax = 0.0;
        double taxrate = 0.0;

        if (income < 300000){
            taxrate = 0.5;
        }
        else if (income >= 300000 && income <= 1000000){
            taxrate = 0.10;
        }
        else
        {
            taxrate = 0.15;
        } 
        tax = income * taxrate;

        if(income > 2000000){
            tax -= tax*0.01;
        }
        System.out.println("Tax to be paid: " + tax);
        scan.close();
    }   

}
