import java.util.Scanner;

public class vowelorcons {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
         System.out.println("Enter a character: ");
         char ch = s.next().charAt(0);
            s.close();
         // Convert character to lowercase for easier comparison
         char lower = Character.toLowerCase(ch);
            // Check if the character is a vowel
            if(lower == 'a' || lower == 'e' || lower == 'i' || lower == '0' || lower == 'u'){
            System.out.println("The character '" + ch + "' is a vowel.");
            }
            else if((lower >= 'a' && lower <= 'z')) {
            System.out.println("The character '" + ch + "' is a consonant.");
            }
            else {
            System.out.println("The character '" + ch + "' is neither a vowel nor a consonant.");
            }
   }
}
