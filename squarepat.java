import java.util.Scanner;
public class squarepat {
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j<col; j++)
            {
            System.out.print(n + " " );
              
            }
            System.out.println();
            n++;
        }
    }
}
