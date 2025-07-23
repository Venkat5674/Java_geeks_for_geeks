import java.util.Scanner;

public class major {
    
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);

        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are Major");
        }
        else{
            System.out.println("You are Minor");
        }
    }

}
