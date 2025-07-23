import java.util.Scanner;
/*public class triangle
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // int i = 1;
        // int j = 1;
        for(int row = 0; row<n; row++){
            for (int col = 0; col<=row; col++){
                System.out.print("* ");
               
            }
            System.out.println();
           
        }

    }
} */

public class triangle
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int row = 1;
        while(row<=n){
            int col = 1;
            while(col<=row){
                System.out.print("* ");
                col++;
            }
            row++;
            System.out.println();
        }

    }
}