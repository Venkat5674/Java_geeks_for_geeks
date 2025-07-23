import java.util.Scanner;

public class multiplicationtable {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        //for loop for printing tabel
        for(int i=1; i<=10; i++){
            System.out.println(n + " X " + i + " = " + n*i);
            sum += n * i;
           
        }
        System.out.println(sum);
    }
}
