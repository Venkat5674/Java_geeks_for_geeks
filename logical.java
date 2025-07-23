import java.util.Scanner;

public class logical {
    
    public static void main(String[] args) {
        String user = "Admin", pass = "1234";

        Scanner sc = new Scanner(System.in);

        String id = sc.nextLine();

        String Password = sc.nextLine();

        if(user.equals(id) && pass.equals(Password)) {
            System.out.println("Hello Welcome");
        }
        else{
            System.out.println("Try Again");
        }
    }
}
