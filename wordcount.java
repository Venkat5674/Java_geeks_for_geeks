import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        String[] words = str.split("\\s+");
        System.out.println("Word count: " + words.length);
    }
}
