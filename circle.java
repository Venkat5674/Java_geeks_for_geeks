import java.util.Scanner;

class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Raduis: ");
        int raduis = sc.nextInt();
        
       Double   area = 3.14*(raduis*raduis);
        
        System.out.println(area);
    }
}