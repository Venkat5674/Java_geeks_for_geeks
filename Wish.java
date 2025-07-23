import java.util.Scanner;

public class Wish {
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the Time: ");
        int time = sc.nextInt();

        if (time < 12 ){
            System.out.print("Good Morning");
        }
        else if (time > 12 && time < 16){
            System.out.print("Good Afternoon");
        }
        else if (time >=16 && time < 21) {
            System.out.print("Good Evening");
        }
        else if(time >= 21 && time <= 24) {
            System.out.print("Good Night");
        }
    }
}
