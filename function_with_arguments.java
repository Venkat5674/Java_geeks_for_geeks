import java.util.Scanner;

class Solution {
     public static int argumentFunction(int a, int b){
        return a + b;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = argumentFunction(a, b);
        System.out.println(result);
    }
    
  
}
