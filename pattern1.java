import java.util.Scanner;

public class pattern1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row = n; row > 0; row--){
            for(int col = 0; col < row; col++){ 
           System.out.print("* ");
                    }  
                    System.out.println("\n");     
                 }
        
        }
    }

