import java.util.Scanner;

public class Ndays {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    int d = sc.nextInt();

    int n = sc.nextInt();

    int x = n % 7;

    int ans  = d - x ; 

    if (ans == 0){
        System.out.println("Sunday");
    }
    else if(ans == 1){
        System.out.println("Monday");
    }
    else if(ans == 2){
        System.out.println("Tuesday");
    }
    else if(ans == 3){
        System.out.println("Wednesday");
    }
    else if(ans == 4){
        System.out.println("Thursday");
    }
    else if(ans == 5){
        System.out.println("Friday");
    }
    else if(ans == 6){
        System.out.println("Saturday");
    }

    sc.close();
    }
}
