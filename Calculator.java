//implementaion of basic calculator app
import java.util.Scanner;

class Calculator {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select an Option:\n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Modulus \n");
        int option = sc.nextInt();

        if(option !=1 && option != 2 && option != 3 && option != 4 && option != 5) {
            System.out.println("You selected an Invalid Option");
        }
        else{
            System.out.print("Enter The First Number: ");
            int a = sc.nextInt();

            System.out.print("Enter the Second Number : ");

            int b = sc.nextInt();

            switch (option) {
                case 1 -> System.out.println("The Addition of " + a + " and " + b + " is: " + (a + b));
                case 2 -> System.out.println("The difference of " + a + " and " + b + " is: " + (a-b));
                case 3 -> System.out.println("The Multiplication of " + a + " and " + b + " is: " + (a*b));
                case 4 -> System.out.println("The Division of " + a + " and " + b + " is: " + (a/b));
                case 5 -> System.out.println("The Modulus of " + a + " and " + b + " is: " + (a%b));
                default -> System.out.println("Selected on Wrong Option! Please select an Valid option...");
            }
        }

    }


}
