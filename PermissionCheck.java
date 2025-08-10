import java.util.Scanner;

public class PermissionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int userPermission = sc.nextInt();
        int requiredBit = sc.nextInt();
        
        boolean hasPermission = (userPermission & requiredBit) != 0;
        
        System.out.println(hasPermission);
        
        sc.close();
    }
}
