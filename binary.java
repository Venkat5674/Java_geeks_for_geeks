import java.util.Scanner;

public class binary {
    static void decToBinary(int n){
        int [] binaryNum = new int[3000];

        int i = 0;

        while(n > 0){
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for(int j =i - 1; j >= 0; j--){
            System.out.print(binaryNum[j]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print("Binary representation of " + n + " is: ");
        decToBinary(n);
    }
}
