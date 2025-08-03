import java.util.Scanner;

class BucketFiller{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter bucket Capacity (in liters) : ");
        int capacity = sc.nextInt();

        System.out.print("Enter the Flow Rate(in liters per Minute) : ");
        int flowrate = sc.nextInt();

        int current = 0;
        int minutes = 0;


        while(current < capacity){
            current = current + flowrate;
            minutes = minutes + 1;
        }
        System.out.println("It Will take " + minutes + " minutes to fill the bucket.");
        sc.close();
    }
}
