import java.util.Scanner;

public class fareride {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Distance of ride: ");
        int dist =scan.nextInt();
        double fare = 0;
        if (dist <= 2){
            fare = 50;
        }else if(dist <= 10)
        {
            fare = 50 + (dist-2)*15;
        }
        else
        {
            fare = 50 +(8 * 15) + (dist - 10) *10;
        }
        if (dist > 20){
            fare = fare * 0.95;
        }
        System.out.println(fare);
        scan.close();
    }
}
