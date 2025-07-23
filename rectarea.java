import java.util.Scanner;

class rectarea
{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int len = s.nextInt();

        System.out.println("Enter the breadth of the rectangle: ");
        int br = s.nextInt();

        int area = len * br;

        System.out.println("The area of the rectangle is: " + area);
    }
}