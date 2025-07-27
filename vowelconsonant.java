import java.util.Scanner;

class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().toLowerCase().charAt(0); // convert to lowercase for easy comparison

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel.");
                break;
            default:
                if ((ch >= 'a' && ch <= 'z'))
                    System.out.println(ch + " is a Consonant.");
                else
                    System.out.println("Invalid input. Please enter an alphabet.");
        }
    }
}
