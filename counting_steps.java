import java.util.Scanner;

public class CountingSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter step size: ");
        int stepSize = sc.nextInt();
        System.out.print("Enter target steps: ");
        int target = sc.nextInt();

        int position = 0, moves = 0;
        while (position < target) {
            position += stepSize;
            moves++;
        }

        System.out.println("Steps needed: " + moves);
    }
}
