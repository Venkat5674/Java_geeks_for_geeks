import java.util.Scanner;

class lastdigit {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        int y = Math.abs(num);

        int lastdigit = y % 10;

        System.out.println(lastdigit);

        sc.close();
    }
}
